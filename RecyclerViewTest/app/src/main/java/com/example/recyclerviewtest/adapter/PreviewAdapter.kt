package com.example.recyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.model.PreviewModel
import kotlinx.android.synthetic.main.item_preview_layout.view.*

class PreviewAdapter:RecyclerView.Adapter<PreviewAdapter.PreviewViewHolder>() {

        private var previewList = emptyList<PreviewModel>()

    class PreviewViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviewViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_preview_layout,parent,false)
        return PreviewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return previewList.size
    }

    override fun onBindViewHolder(holder: PreviewViewHolder, position: Int) {
        holder.itemView.preview_name.text = previewList[position].previewName
        holder.itemView.preview_genre.text = previewList[position].previewGenre
        holder.itemView.preview_image.int = previewList[position].previewImage
    }

    fun setList(list:List<PreviewModel>){
        previewList = list
        notifyDataSetChanged()
    }


}