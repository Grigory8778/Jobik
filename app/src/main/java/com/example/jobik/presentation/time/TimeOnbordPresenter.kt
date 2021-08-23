package com.example.jobik.presentation.time

import com.example.jobik.data.LocalRepository
import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router

class TimeOnbordPresenter(
    private val router: Router,
    private val repository: LocalRepository,
    private val view: TimeOnbordView
) {
    fun openMain() {
        router.navigateTo(Screens.getMainScreens())
    }

    fun saveMin(mint: Int) {
        repository.saveMin(mint)
    }

    fun saveHour(hour: Int) {
        repository.saveHour(hour)
    }

    fun saveStatus(status: Boolean) {
        repository.saveStatus(status)
    }

    fun initial() {
        view.setHour(repository.getHour())
        view.setMin(repository.getMin())
    }
}