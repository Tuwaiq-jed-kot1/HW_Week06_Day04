package com.tuwaiq.restandretrofit.data.network

import com.sumaya.hw_week06_day03.data.YoutubeData

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class YoutubeRepo {
    private val api = YoutubeBuilder.YoutubeAPI

    suspend fun fetchVideos():YoutubeData = withContext(Dispatchers.IO){
        api.fetchVideos()}
}
