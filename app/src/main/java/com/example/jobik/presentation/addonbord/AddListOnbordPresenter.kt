package com.example.jobik.presentation.addonbord

import com.example.jobik.navigation.Screens

import com.github.terrakok.cicerone.Router

class AddListOnbordPresenter(private val router: Router) {
    fun getAdd() {
        router.navigateTo(Screens.getTimeScreens())
    }
}