package com.example.recipebook.chats

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.R

class ChatAdapter(private var chatList: List<Chat>): RecyclerView.Adapter<ChatAdapter.ChatViewHolder>(){

    inner class ChatViewHolder(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(
        inflater.inflate(R.layout.chats_views_item, parent, false)) {
        private var chatsImage: ImageView? = null
        private var chatsName: TextView? = null
        private var chatsMessage: TextView? = null

        init {
            chatsImage = itemView.findViewById(R.id.chat_image)
            chatsName = itemView.findViewById(R.id.chat_name)
            chatsMessage = itemView.findViewById(R.id.chat_desc)
        }

        fun bind(chat: Chat){
            chatsImage?.setImageResource(chat.image)
            chatsName?.text = chat.name
            chatsMessage?.text = chat.chatDesc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ChatViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat: Chat = chatList[position]
        holder.bind(chat)
    }

    override fun getItemCount(): Int =  chatList.size
}