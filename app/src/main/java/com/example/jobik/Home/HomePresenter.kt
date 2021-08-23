package com.example.jobik.Home

import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class HomePresenter(private val router: Router){
    fun getHomeToSheet(){
        router.navigateTo(Screens.getSheet())
    }
    fun getMainSheet(){
        router.navigateTo(Screens.getMainSheet())
    }
}
