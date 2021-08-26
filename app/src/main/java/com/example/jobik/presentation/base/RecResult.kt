package com.example.jobik.presentation.base

sealed class Item {

    data class Elements(
        val name: String,
        val image: Int,
        val backgraund: Int,
        val state :Boolean=false
    ) : Item()

    data class Title(val title: String) : Item()
}