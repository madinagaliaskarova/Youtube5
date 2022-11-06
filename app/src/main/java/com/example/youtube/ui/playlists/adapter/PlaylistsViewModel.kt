package com.example.youtube.ui.playlists.adapter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.youtube.App.Companion.repository
import com.example.youtube.BuildConfig.API_KEY
import com.example.youtube.data.remote.model.Playlists
import com.example.youtube.core.common.Constant
import com.example.youtube.data.remote.ApiService
import com.example.youtube.core.ui.BaseViewModel
import com.example.youtube.core.remote.RetrofitClient
import com.example.youtube.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PlaylistsViewModel : BaseViewModel() {



    fun getPlaylists(): LiveData<Playlists> {
        return repository.getPlayLists()
    }
}

