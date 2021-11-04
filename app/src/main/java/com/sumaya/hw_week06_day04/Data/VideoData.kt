package com.sumaya.hw_week06_day04.Data




data class youtyubeV (
    val videos: List<VideoData>
        )


data class VideoData(
    val id : Int,
    val name : String,
    val link : String,
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
)

data class Channel (
    val name : String,
        )