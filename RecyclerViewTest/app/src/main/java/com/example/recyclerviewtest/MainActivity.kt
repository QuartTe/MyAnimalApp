package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.adapter.PreviewAdapter
import com.example.recyclerviewtest.databinding.ActivityMainBinding
import com.example.recyclerviewtest.model.PreviewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var adapter:PreviewAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial(){
        recyclerView = binding.rvPreview
        adapter = PreviewAdapter()
        recyclerView.adapter = adapter

    }

    fun myPreview():ArrayList<PreviewModel>{
        val previewList = ArrayList<PreviewModel>()

        val preview = PreviewModel("Laptop","Comedy",)

        return previewList

    }
}