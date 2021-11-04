package com.sumaya.hw_week06_day03.network;

import com.sumaya.hw_week06_day03.data.YoutubeData
import retrofit2.Call
import retrofit2.http.GET

interface YoutubeApi {

    @GET("youtube/home_feed/")
    suspend fun fetchVideos(): YoutubeData
}
