package com.example.youtube.data.remote.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.youtube.databinding.ItemPlaylistsBinding

class PlaylistsAdapter : RecyclerView.Adapter<PlaylistsAdapter.PlaylistsViewHolder>() {
    private val data = mutableListOf<String>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistsViewHolder {
        return PlaylistsViewHolder(
            ItemPlaylistsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PlaylistsViewHolder, position: Int) {
        holder.bind()
    }


    override fun getItemCount(): Int = data.size


    inner class PlaylistsViewHolder(private val binding: ItemPlaylistsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {

        }

    }
}