package com.example.jobik.presentation.home

import androidx.lifecycle.ViewModel
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class HomeViewModel(private val router: Router) : ViewModel() {
    fun openHomeToSheet() {
        router.navigateTo(Screens.getSheet())
    }

    fun openMainSheet() {
        router.navigateTo(Screens.getMainSheet())
    }
}
