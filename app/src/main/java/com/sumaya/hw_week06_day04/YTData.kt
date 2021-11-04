package com.sumaya.hw_week06_day04

import java.nio.channels.Channel


data class YTData (
val videos: List<YTVideos>
)

data class YTVideos(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val channel: Channel,
    val numberOfViews: Int
)
data class YTChannel(
    val name: String
)