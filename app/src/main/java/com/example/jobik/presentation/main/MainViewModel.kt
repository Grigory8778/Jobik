package com.example.jobik.presentation.main

import androidx.lifecycle.ViewModel
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class MainViewModel(
    private val router: Router
) : ViewModel() {

    fun openHome() {
        router.navigateTo(Screens.getHomeScreens())
    }
}