package com.akirachix.blogsarticles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class BlogsAdapter (var blogArticles: List<Blogs>)
    :RecyclerView.Adapter<BlogsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_display, parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blogger = blogArticles[position]
        holder.tvName.text = blogger.name
        holder.tvTitle.text = blogger.title
        holder.tvDate.text = blogger.publishingDate
        holder.tvPreview.text = blogger.articlePreview
    }

    override fun getItemCount(): Int {
      return blogArticles.size
    }
}

class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
}