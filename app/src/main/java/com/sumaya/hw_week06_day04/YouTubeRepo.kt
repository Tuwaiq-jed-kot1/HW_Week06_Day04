package com.shady.restandretrofit.data.network

import com.sumaya.hw_week06_day04.YoutubeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YouTubeRepo {
    private val api = YoutubeBuilder.YOUTUBE_API

    suspend fun fetchInterestingList(): YoutubeData = withContext(Dispatchers.IO) {
        api.fetchPhotos()
    }
}