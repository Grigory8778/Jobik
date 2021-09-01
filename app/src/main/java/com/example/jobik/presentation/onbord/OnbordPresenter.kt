package com.example.jobik.presentation.onbord

import com.example.jobik.data.TimeRepository
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class OnbordPresenter(private val router: Router, private val repository: TimeRepository) {
    fun openHelloOnbord() {
        router.replaceScreen(Screens.getHelloOneScreens())
    }

    fun openOnbord() {
        router.navigateTo(Screens.getOnbornScreens())
    }

    fun openMain() {
        router.newRootScreen(Screens.getMainScreens())
    }

    fun saveData() {
        if (repository.getStatus()) {
            openHelloOnbord()
        } else {
            openMain()
        }
    }
}