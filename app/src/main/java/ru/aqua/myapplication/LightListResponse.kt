package ru.aqua.myapplication

import com.google.gson.annotations.SerializedName

 class LightListItem(
        @SerializedName("pin") val pin: Int,
        @SerializedName("created") val created: Int,
        @SerializedName("name") val name: String,
        @SerializedName("___class") val ___class: String,
        @SerializedName("state") val state: Boolean,
        @SerializedName("ownerId") val ownerId: String,
        @SerializedName("updated") val updated: Int,
        @SerializedName("objectId") val objectId: String,
        @SerializedName("off") val off: Int,
        @SerializedName("enabled") val enabled: Boolean,
        @SerializedName("on") val on: Int

)
data class LightListResponse(val results : List<LightListItem>)