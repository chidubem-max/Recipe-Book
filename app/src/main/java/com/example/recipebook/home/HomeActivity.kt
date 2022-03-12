package com.example.recipebook.home

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.*
import com.example.recipebook.chats.ChatsActivity
import com.example.recipebook.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private var notificationArray = arrayListOf(
        Notification("Onyeukwu Chidubem","Prevailing wisdom claims that the best way to achieve what we want", R.drawable.ic_dot),
        Notification("Onyeukwu Chinagorom","getting into better shape", R.drawable.ic_dot),
        Notification("Onyeukwu Samuel","I wanted to lift in the gym", R.drawable.ic_dot),
        Notification("Onyeukwu Adaoma","systems and goals", R.drawable.ic_dot),
        Notification("Onyeukwu Chinagorom","set specific, actionable goals", R.drawable.ic_dot),
        Notification("Onyeukwu Adaoma","systems and goals", R.drawable.ic_dot)

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val cue = binding.root
        setContentView(cue)

        binding.notificationRv.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        binding.notificationRv.adapter = HomeAdapter(notificationArray)

        binding.recipesBtn.setOnClickListener{
            startActivity(Intent(this, RecipeOne::class.java))
        }

        binding.chatsBtn.setOnClickListener {
            startActivity(Intent(this, ChatsActivity::class.java))
        }

        binding.networksBtn.setOnClickListener {
            startActivity(Intent(this, Networks::class.java))
        }

        binding.friendsBtn.setOnClickListener{
            startActivity(Intent(this, Friends::class.java))
        }

        binding.favBtn.setOnClickListener {
            startActivity(Intent(this, Favorites::class.java))
        }
        }

}