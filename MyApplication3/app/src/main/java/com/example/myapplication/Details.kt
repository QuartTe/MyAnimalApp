package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityDetailsBinding

class Details: AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var animal = intent.getParcelableExtra<Animal>("creature")
        binding.textDetailsCreature.text = animal!!.description
        binding.imageViewCreature.setImageResource(animal!!.image)
    }


}