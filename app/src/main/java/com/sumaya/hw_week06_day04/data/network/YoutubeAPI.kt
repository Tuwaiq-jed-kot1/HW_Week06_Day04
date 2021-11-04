package com.shady.restandretrofit.data.network

import retrofit2.http.GET
import com.shady.restandretrofit.data.models.YouTubData

interface YoutubeAPI {
    @GET("youtube/home_feed")
    suspend fun fetchVideos(): YouTubData
}