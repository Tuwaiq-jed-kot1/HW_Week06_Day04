package com.sumaya.hw_week06_day04.data.network

import com.sumaya.hw_week06_day04.data.models.YouTubeData
import retrofit2.http.GET

interface YouTubeAPI {

    @GET("youtube/home_feed")
    suspend fun fetchVideos(): YouTubeData

}