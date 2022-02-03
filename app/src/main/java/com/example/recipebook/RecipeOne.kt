package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RecipeOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_one)

        val backBtn =findViewById<ImageButton>(R.id.back_btn)
        backBtn.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}