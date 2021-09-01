package com.example.jobik.presentation.addonbord

import androidx.annotation.RestrictTo
import com.example.jobik.data.ElementsRepository
import com.example.jobik.presentation.navigation.Screens

import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.coroutineScope

class AddListOnbordPresenter(
    private val router: Router,
    private val repository: ElementsRepository,
    private val view: AddListOnbordView
) {
    fun getAdd() {
        router.navigateTo(Screens.getTimeScreens())
    }

    fun getList() {
    view.showList(repository.getElements())
    }

}