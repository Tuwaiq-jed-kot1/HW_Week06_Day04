package com.sumaya.hw_week06_day04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainVM:ViewModel() {
    val repo = youtubeRepo()
    fun fetchInterestingList(): LiveData<youtubeData> {
        val videos = MutableLiveData<youtubeData>()
        viewModelScope.launch {
    videos.postValue(repo.fetchInterestingList())
}

        return videos
    }

}