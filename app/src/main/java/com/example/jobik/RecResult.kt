package com.example.jobik

sealed class Item{

    data class Elements(
        val name: String,
        val image: Int,
        val backgraund:Int
        ):Item()

    data class Title(val title:String):Item()
}