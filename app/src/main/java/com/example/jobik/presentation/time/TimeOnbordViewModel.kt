package com.example.jobik.presentation.time

import androidx.lifecycle.ViewModel
import com.example.jobik.data.TimeRepository
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router

class TimeOnbordViewModel(
    private val router: Router,
    private val repository: TimeRepository,

    ) : ViewModel() {
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
        repository.getHour()
        repository.getMin()
    }
}