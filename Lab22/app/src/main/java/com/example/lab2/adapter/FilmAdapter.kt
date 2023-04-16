package com.example.lab2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab2.Film
import com.example.lab2.R
import com.example.lab2.databinding.FilmItemBinding

class FilmAdapter(val fragment:(film:Film)->Unit):RecyclerView.Adapter<FilmAdapter.FilmHolder>() {

    var filmList = ArrayList<Film>()

    inner class FilmHolder(item:View):RecyclerView.ViewHolder(item) {
        val binding = FilmItemBinding.bind(item)
        fun bind(film: Film) {
            Glide
                .with(binding.root)
                .load(film.image)
                .fitCenter()
                .into(binding.imageFilm)

            binding.filmName.text = film.name

            binding.recyclerViewFilmItem.setOnClickListener {
                fragment(filmList[adapterPosition])
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.film_item, parent, false)
        return FilmHolder(view)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.bind(filmList[position])
    }

    fun addFilm(filmList: ArrayList<Film>) {
        this.filmList.clear()
        this.filmList = filmList
        notifyDataSetChanged()
    }

}