package com.sumaya.hw_week06_day04.network

import com.sumaya.hw_week06_day04.models.YouTubData
import retrofit2.http.GET

interface YouTubeAPI {

    @GET("youtube/home_feed")
    suspend fun vidsInfo(): YouTubData
}