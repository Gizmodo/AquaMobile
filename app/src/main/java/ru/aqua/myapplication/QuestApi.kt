package ru.aqua.myapplication

import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface QuestApi {

    @GET("./data/Light")
    fun getLamps(): Single<List<Model.LightListItem>>
}