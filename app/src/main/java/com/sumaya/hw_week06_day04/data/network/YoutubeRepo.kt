package com.shady.restandretrofit.data.network

import com.shady.restandretrofit.data.models.YouTubData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    private val api = YoutubeBuilder.YOUTUBE_API

    suspend fun fetchInterestingList(): YouTubData = withContext(Dispatchers.IO) {
        api.fetchVideos()
    }
}