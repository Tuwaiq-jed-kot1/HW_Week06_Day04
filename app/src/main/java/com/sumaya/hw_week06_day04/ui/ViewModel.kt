package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.data.models.UserInfo
import com.sumaya.hw_week06_day04.data.network.YoutubeRepo
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    val repo = YoutubeRepo()

    fun fetchInterestingList(): LiveData<UserInfo> {

        val userInfo = MutableLiveData<UserInfo>()

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