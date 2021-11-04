package com.sumaya.hw_week06_day04


data class YoutubeData(
    val videos: List<Videos>
)

data class Videos(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val channel: Channel,
    val numberOfViews: Int
)


data class Channel(
    val name: String
)