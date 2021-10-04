package com.example.jobik.presentation.base

sealed class Item {

    data class Elements(
        val name: String,
        val image: Int,
        val color: Int,
        var state: Boolean = false,
    ) : Item()

    data class Title(val title: Int) : Item()
}