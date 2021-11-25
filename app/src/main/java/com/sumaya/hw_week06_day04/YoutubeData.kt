package com.sumaya.hw_week06_day04

import com.google.gson.annotations.SerializedName

data class YoutubeData(
    val videos:YoutubeListVideos
)

data class YoutubeListVideos(
    val video:List<YoutubeVideo>
)

data class YoutubeVideo (
    var videoId:Int = 0,
    var videoName:String = "1st Video",
    @SerializedName("url_s")
    var imgUrl:String = "1st Video Image",
    var nameOfChannel:String = "nameOfChannel",
    var numberOfViews:Int = 0
                         )