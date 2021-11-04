package com.sumaya.hw_week06_day04

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    val repo = YTRepo()

    fun fetchInterestingList(): LiveData<YTData> {

        val userInfo = MutableLiveData<YTData>()

        viewModelScope.launch {
            try {
                userInfo.postValue(repo.fetchVideoInfo())
            } catch (e: Throwable) {
                Log.e("Youtube VideosInfo", "The Problem: ${e.localizedMessage}")
            }
        }

        return userInfo
    }

}