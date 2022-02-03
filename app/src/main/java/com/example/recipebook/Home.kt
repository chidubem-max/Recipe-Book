package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recipeBtn = findViewById<CardView>(R.id.recipes_btn)
        recipeBtn.setOnClickListener {
            startActivity(Intent(this,RecipeOne::class.java))
        }

        val chatsBtn = findViewById<CardView>(R.id.chats_btn)
        chatsBtn.setOnClickListener {
            startActivity(Intent(this, Chats::class.java))
        }

        val networksBtn = findViewById<CardView>(R.id.networks_btn)
        networksBtn.setOnClickListener {
            startActivity(Intent(this,Networks::class.java))
        }

        val friendsBtn = findViewById<CardView>(R.id.friends_btn)
        friendsBtn.setOnClickListener {
            startActivity(Intent(this,Friends::class.java))
        }

        val favBtn = findViewById<CardView>(R.id.fav_btn)
        favBtn.setOnClickListener {
            startActivity(Intent(this,Favorites::class.java))
        }
    }
}