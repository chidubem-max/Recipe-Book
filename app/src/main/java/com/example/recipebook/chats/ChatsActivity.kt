package com.example.recipebook.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.R
import com.example.recipebook.databinding.ActivityChatsBinding

class ChatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatsBinding
    private var chatArray = arrayListOf(
        Chat("Che Michael",R.drawable.image, "I am fine"),
        Chat("Pete DavidSon",R.drawable.image, "I am a boy"),
        Chat("Collin John",R.drawable.image, "I play for the Hawks"),
        Chat("Che Michael",R.drawable.image, "I am fine"),
        Chat("Collin John",R.drawable.image, "I play for the Hawks"),
        Chat("Che Michael",R.drawable.image, "I am fine"),
        Chat("Pete DavidSon",R.drawable.image, "I am a boy"),
        Chat("Collin John",R.drawable.image, "I play for the Hawks"),
        Chat("Odell Beckham",R.drawable.image, "I play for the Hawks"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.chatsRv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        binding.chatsRv.adapter = ChatAdapter(chatArray)
    }
}