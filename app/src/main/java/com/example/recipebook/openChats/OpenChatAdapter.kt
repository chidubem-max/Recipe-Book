package com.example.recipebook.openChats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.R

class OpenChatAdapter(private val chatList: List<OpenChat>): RecyclerView.Adapter<OpenChatAdapter.OpenChatViewHolder>(){

    inner class OpenChatViewHolder(inflater: LayoutInflater,parent:ViewGroup):RecyclerView.ViewHolder(
        inflater.inflate(R.layout.opened_chats_item,parent,false)){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpenChatViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: OpenChatViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}