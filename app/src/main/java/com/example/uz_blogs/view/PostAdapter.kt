package com.example.uz_blogs.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uz_blogs.databinding.PostItemLayoutBinding
import com.example.uz_blogs.model.PostModel
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

class PostAdapter(val items: List<PostModel>): RecyclerView.Adapter<PostAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: PostItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(PostItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.binding.postTitle.text = item.text
        val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS")
        val date = formatter.parse(item.publishDate)
        val outFormatter = SimpleDateFormat("yyyy-MM-dd HH:mm")
        holder.binding.postDate.text = outFormatter.format(date)
        holder.binding.like.text = item.likes.toString()
        Glide.with(holder.itemView.context).load(item.image).into(holder.binding.postImage)

    }
    override fun getItemCount(): Int {
        return items.count()
    }
}