package com.example.youtube.ui.playlists.adapter

import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.youtube.databinding.ActivityMainBinding
import com.example.youtube.core.ui.BaseActivity

class PlaylistsActivity : BaseActivity<PlaylistsViewModel, ActivityMainBinding>() {
    override val viewModel: PlaylistsViewModel by lazy {
        ViewModelProvider(this)[PlaylistsViewModel::class.java]

    }

    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
       return ActivityMainBinding.inflate(inflater)
    }

    override fun initViewModel() {
        viewModel.getPlaylists().observe(this) {
            Toast.makeText(this, it.etag.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}