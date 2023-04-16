package com.example.lab2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab2.adapter.FilmAdapter
import com.example.lab2.databinding.FragmentRootBinding


class RootFragment:Fragment(R.layout.fragment_root) {
    private lateinit var binding: FragmentRootBinding


    private val adapter = FilmAdapter{
        newFragmentStart(it)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRootBinding.bind(view)

        binding.recyclerViewFilmList.adapter = adapter
        binding.recyclerViewFilmList.layoutManager = LinearLayoutManager(requireContext())

        adapter.addFilm(getData())
    }

    private fun newFragmentStart(film: Film){

        val destination = RootFragmentDirections.actionFragmentRootToFragmentMore(film)

        findNavController().navigate(destination)
    }

    private fun getData(): ArrayList<Film>{
        return arrayListOf(
            Film(
                getString(R.string.film_1_name),
                getString(R.string.film_1_description),
                "https://m.media-amazon.com/images/M/MV5BOGQzZTBjMjQtOTVmMS00NGE5LWEyYmMtOGQ1ZGZjNmRkYjFhXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_FMjpg_UX1000_.jpg"
            ),
            Film(
                getString(R.string.film_2_name),
                getString(R.string.film_2_description),
                "https://upload.wikimedia.org/wikipedia/uk/7/73/%D0%A2%D0%B5%D1%80%D0%BC%D1%96%D0%BD%D0%B0%D1%82%D0%BE%D1%801.jpg"
            ),
            Film(
                getString(R.string.film_3_name),
                getString(R.string.film_3_description),
            "https://resizing.flixster.com/WAHXGKleT3QvhqHUlFGIRgcQAjU=/206x305/v2/https://flxt.tmsimg.com/assets/p173378_p_v8_au.jpg"
             ),
            Film(
                getString(R.string.film_4_name),
                getString(R.string.film_4_description),
                "https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg"
            ),
            Film(
                getString(R.string.film_5_name),
                getString(R.string.film_5_description),
                "https://eneyida.tv/uploads/posts/2019-12/1576701369_1.jpg"
            ),
            Film(
                getString(R.string.film_6_name),
                getString(R.string.film_6_description),
                "https://upload.wikimedia.org/wikipedia/en/c/cd/Trumanshow.jpg"
            ),
            Film(
                getString(R.string.film_7_name),
                getString(R.string.film_7_description),
                "https://upload.wikimedia.org/wikipedia/uk/2/2c/%D0%94%D0%B5%D0%BD%D1%8C_%D0%B1%D0%B0%D0%B1%D0%B0%D0%BA%D0%B0_%D0%BF%D0%BE%D1%81%D1%82%D0%B5%D1%80.jpg"
            ))
    }

}