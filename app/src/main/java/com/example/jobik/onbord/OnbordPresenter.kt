package com.example.jobik.onbord

import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class OnbordPresenter(private val router: Router) {
    fun openHelloOnbord() {
        router.navigateTo(Screens.getHelloScreens())
    }
}