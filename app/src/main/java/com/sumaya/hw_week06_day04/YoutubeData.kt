package com.sumaya.hw_week06_day04

data class YouTubData(
    val videos : List<Video>
)



data class Video (
    val id : Int,
    val name : String,
    @SerializedName("imageUrl")
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
)


data class Channel (
    val name : String
)