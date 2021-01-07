package ru.aqua.myapplication


import com.google.gson.annotations.SerializedName
object Model {
    data class LightListItem(
            @SerializedName("pin") val pin: Int,
            @SerializedName("created") val created: Long,
            @SerializedName("name") val name: String,
            @SerializedName("___class") val ___class: String,
            @SerializedName("state") val state: Boolean,
            @SerializedName("ownerId") val ownerId: String,
            @SerializedName("updated") val updated: Long,
            @SerializedName("objectId") val objectId: String,
            @SerializedName("off") val off: Long,
            @SerializedName("enabled") val enabled: Boolean,
            @SerializedName("on") val on: Long

    )
}