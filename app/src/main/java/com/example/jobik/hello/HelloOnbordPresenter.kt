package com.example.jobik.hello

import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class HelloOnbordPresenter(private val router: Router) {
    fun getHello() {
        router.navigateTo(Screens.getAddListScreens())
    }
}