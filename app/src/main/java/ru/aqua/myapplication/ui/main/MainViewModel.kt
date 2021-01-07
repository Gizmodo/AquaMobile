package ru.aqua.myapplication.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.aqua.myapplication.QuestApi

class MainViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    override fun onCleared() {
        compositeDisposable.dispose();
        super.onCleared()
    }

    fun fetchQuestList(questApi: QuestApi?) {
        questApi?.let {
            compositeDisposable.add(
                    questApi.getLamps()
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe({
                                Log.d("TAG", "Success")
                               Log.d("TAG",it.first().name)
                            }, {
                                Log.e("TAG", "Fail", it)
                            })
            )
        }
    }
}