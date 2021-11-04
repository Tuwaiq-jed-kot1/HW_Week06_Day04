package com.sumaya.hw_week06_day04.modle

data class YoutubeData(
    val videos: List<Videos>
)

data class Channel(

    val name: String,

)

data class Videos(

    val id: Int,
    val name: String,
    val imageUrl: String,
    val channel: Channel,
    val numberOfViews: Int
)

