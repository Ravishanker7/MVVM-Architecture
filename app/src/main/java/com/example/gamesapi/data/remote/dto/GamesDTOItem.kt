package com.example.gamesapi.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GamesDTOItem(
    val developer: String,
    @SerializedName("freetogame_profile_url")
    val freeToGameprofileUrl: String,
    @SerializedName("game_url")
    val gameUrl: String,
    val genre: String,
    val id: Int,
    val platform: String,
    val publisher: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("short_description")
    val shortDescription: String,
    val thumbnail: String,
    val title: String
)