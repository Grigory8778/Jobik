package com.example.jobik.Main

import com.example.jobik.App
import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class MainPresenter(private val router: Router) {
    fun getOpenHome() {
        router.navigateTo(Screens.getHomeScreens())
    }
}