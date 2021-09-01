package com.example.jobik.presentation.hellionbord

import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class HelloOnbordPresenter(private val router: Router) {
    fun getHelloToAddScreens() {
        router.navigateTo(Screens.getAddListScreens())
    }
    fun getHelloOneToHelloSecond(){
        router.navigateTo(Screens.getHelloSecondScreen())
    }
    fun getHelloSecondToHelloThird(){
        router.navigateTo(Screens.getHelloThirdScreen())
    }
}