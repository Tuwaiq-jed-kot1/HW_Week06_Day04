package com.sumaya.hw_week06_day04

//data class YoutubeData (
//    val videos: List<Videos>
//)

data class YoutubeChannel(
    val name: String
)


data class YoutubeInfo(
    val id: Int,
    val name : String,
    val imageUrl: String,
    val channel: String,
    val numberOfViews: Int,
    val link : String

)