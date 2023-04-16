package com.example.laab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.example.laab2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.''.setOnClickListener{
            val url = 'https://terraria.wiki.gg/images/4/41/Bouncy_Boulder_%28projectile%29.png'

            val imagePath = binding.imageView
            Glide.with(this)
                .load(url)
                .into()
        }
    }
}