package com.example.jobik.presentation.hellionbord

import androidx.lifecycle.ViewModel
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router

class HelloOnbordViewModel(
    private val router: Router
    ) : ViewModel() {

    fun getHelloToAddScreens() {
        router.navigateTo(Screens.getAddListScreens())
    }

    fun getHelloOneToHelloSecond() {
        router.navigateTo(Screens.getHelloSecondScreen())
    }

    fun getHelloSecondToHelloThird() {
        router.navigateTo(Screens.getHelloThirdScreen())
    }
}
