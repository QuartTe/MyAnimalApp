package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val re = Animal(getString(R.string.rexdesct),R.drawable.ic_action_name)
        val po = Animal(getString(R.string.pollydesct),R.drawable.parrot_polly)
        val bu = Animal(getString(R.string.bubadesct),R.drawable.hamster_buba)
        binding.buttonRex.setOnClickListener {
            val i = Intent(this,Details::class.java)
            i.putExtra("creature",re)
            startActivity(i)
        }
        binding.buttonPolly.setOnClickListener {
            val i = Intent(this,Details::class.java)
            i.putExtra("creature",po)
            startActivity(i)
        }
        binding.buttonBuba.setOnClickListener {
            val i = Intent(this,Details::class.java)
            i.putExtra("creature",bu)
            startActivity(i)
        }

    }




}