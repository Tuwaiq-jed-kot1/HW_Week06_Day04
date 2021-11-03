package com.sumaya.hw_week06_day04.data.network

import retrofit2.http.GET
import com.sumaya.hw_week06_day04.data.modules.YoutubeData

interface YoutubeAPI {
    @GET("https://api.letsbuildthatapp.com/youtube/home_feed/")
    suspend fun fetchVideos():YoutubeData
}