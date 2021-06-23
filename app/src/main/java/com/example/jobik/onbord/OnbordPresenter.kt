package com.example.jobik.onbord

import com.example.jobik.App
import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class OnbordPresenter(private val router: Router) {
    fun openHelloOnbord() {
        router.navigateTo(Screens.getHelloScreens())
    }

    fun openOnbord() {
        router.navigateTo(Screens.getOnbornScreens())
    }

    fun openMain() {
        router.navigateTo(Screens.getMainScreens())
    }
    fun saveData() {
        if (App.INSTANCE.sharedPreferences.getBoolean(App.kayBool, true)) {
            openHelloOnbord()
        } else {
            openMain()
        }
    }
}