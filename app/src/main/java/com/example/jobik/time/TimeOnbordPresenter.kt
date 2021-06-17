package com.example.jobik.time

import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class TimeOnbordPresenter(private val router: Router) {
    fun openMain() {
        router.navigateTo(Screens.getMainScreens())
    }
}