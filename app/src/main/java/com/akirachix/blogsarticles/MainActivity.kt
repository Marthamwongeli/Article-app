package com.akirachix.blogsarticles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogsarticles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogDisplay.layoutManager = LinearLayoutManager(this)
        displayArticle()

        }

    fun displayArticle(){
        val article1 = Blogs("Martha", "Dion", "January 2016", "")
        val article2 = Blogs("Martha", "Dion", "January 2016", "")
        val article3 = Blogs("Martha", "Dion", "January 2016", "")
        val article4 = Blogs("Martha", "Dion", "January 2016", "")
        val article5 = Blogs("Martha", "Dion", "January 2016", "")
        val article6  = Blogs("Martha", "Dion", "January 2016", "")

        val articleList = listOf(article1, article2, article3, article4, article5,article6)
        val blogsAdapter = BlogsAdapter(articleList)
        binding.rvBlogDisplay.adapter = blogsAdapter

    }
    }
