package com.example.uz_blogs.model

import java.io.Serializable

data class UserModel(
    val id: String,
    val firstName: String,
    val lastName: String,
    val picture: String
): Serializable
