package com.sumaya.hw_week06_day04

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class YoutubeRepo {
    private val api = YoutubeBuilder.youtubeAPI

    suspend fun youTubeInfo(): YoutubeData = withContext(Dispatchers.IO) {
        api.fetchVideoInfo()
    }
}
