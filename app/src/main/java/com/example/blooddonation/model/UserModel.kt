package com.example.blooddonation.model

data class UserModel(
    val id: String? = "",
    val name: String? = "",
    val phone: String? = "",
    val blood: String? = "",
    val division: String? = "",
    val district: String? = "",
    val email: String? = "",
    val password: String? = "",
)