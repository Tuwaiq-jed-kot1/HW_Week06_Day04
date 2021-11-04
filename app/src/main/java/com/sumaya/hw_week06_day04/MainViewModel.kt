package com.sumaya.hw_week06_day04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val repo = YoutubeRepo()
    fun youTubeInfo(): LiveData<YouTubData> {
        val videos = MutableLiveData<YouTubData>()
        viewModelScope.launch {
            try {
                videos.postValue(repo.youTubeInfo())
            } catch (e: Throwable){
                Log.e("YouTube Videos", "YouTube Videos Problem: ${e.localizedMessage}")
            }
        }
        return videos
    }
}