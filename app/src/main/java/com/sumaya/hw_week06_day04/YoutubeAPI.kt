package com.sumaya.hw_week06_day04


import retrofit2.http.GET
import com.sumaya.hw_week06_day04.YoutubeData

interface YoutubeAPI {
    @GET("https://api.letsbuildthatapp.com/youtube/home_feed/")
    suspend fun fetchVideos():YoutubeData
}