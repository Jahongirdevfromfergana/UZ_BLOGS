package com.example.uz_blogs.model

data class PostModel(
    val id: String,
    val image: String,
    val text: String,
    val publishDate: String,
    val likes: Int
)