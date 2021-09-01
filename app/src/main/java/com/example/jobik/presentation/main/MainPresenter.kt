package com.example.jobik.presentation.main

import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class MainPresenter(private val router: Router) {
    fun getOpenHome() {
        router.navigateTo(Screens.getHomeScreens())
    }
}