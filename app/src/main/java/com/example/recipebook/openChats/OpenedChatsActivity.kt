package com.example.recipebook.openChats

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipebook.R
import com.example.recipebook.databinding.ActivityOpenedChatsBinding

class OpenedChatsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOpenedChatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOpenedChatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}