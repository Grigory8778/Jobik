package com.example.jobik.presentation.onbord

import androidx.lifecycle.ViewModel
import com.example.jobik.data.TimeRepository
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class OnbordActivityViewModel(private val router: Router, private val repository: TimeRepository) :
    ViewModel() {
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