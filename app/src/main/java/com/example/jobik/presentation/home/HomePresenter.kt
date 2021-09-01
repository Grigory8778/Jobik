package com.example.jobik.presentation.home

import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class HomePresenter(private val router: Router){
    fun getHomeToSheet(){
        router.navigateTo(Screens.getSheet())
    }
    fun getMainSheet(){
        router.navigateTo(Screens.getMainSheet())
    }
}
