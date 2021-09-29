package com.example.jobik.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.launch

class HomeViewModel(
    private val router: Router,
    private val databaseRepository: WorkplaceRepository,
) : ViewModel() {
    fun openHomeToSheet() {
        router.navigateTo(Screens.getSheet())
    }

    fun openMainSheet() {
        router.navigateTo(Screens.getMainSheet())
    }
    fun addListHome(workplace: String) {

        viewModelScope.launch {
            val list = databaseRepository.getList("Дом")
            databaseRepository.getList(workplace)
        }
    }
}
