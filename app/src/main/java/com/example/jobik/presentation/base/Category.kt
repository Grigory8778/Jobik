package com.example.jobik.presentation.base

sealed class Category {
    data class Elements(
        val name: String,
        val image: Int,
    ) : Category()

    data class AddCategory(
        val name: String,
        val image: Int,
    ) : Category()
}