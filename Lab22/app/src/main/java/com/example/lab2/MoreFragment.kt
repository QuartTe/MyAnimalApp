package com.example.lab2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.lab2.databinding.FragmentMoreBinding

class MoreFragment: Fragment(R.layout.fragment_more) {

    private lateinit var binding: FragmentMoreBinding

    private val args:MoreFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMoreBinding.bind(view)

        var film = args.film

        Glide.with(binding.imageFilmTwo.context)
            .load(film.image)
            .into(binding.imageFilmTwo)

        with(binding){
            nameFilm.text = film.name
            descriptionFilm.text = film.description
        }
    }
}