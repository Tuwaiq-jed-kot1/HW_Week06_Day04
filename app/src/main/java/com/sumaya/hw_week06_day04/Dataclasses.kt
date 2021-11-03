package com.sumaya.hw_week06_day04



data class Channel (
    var name: String
)

data class Video (
    var id:Int,
    var name: String,
    var link: String,
    var imageUrl: String,
    var channel: Channel,
    var numberOfViews :Int)


data class YTRoot (
    var videos: List<Video>
)
