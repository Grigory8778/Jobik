package com.example.jobik.presentation.hellionbord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.data.ElementsRepository
import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainRepository
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.launch

class HelloOnbordViewModel(
    private val router: Router,
    private val databaseRepository: WorkplaceRepository,
) : ViewModel() {

    fun openHelloToAddScreens() {
        router.navigateTo(Screens.getAddListScreens())
    }

    fun openHelloOneToHelloSecond() {
        router.navigateTo(Screens.getHelloSecondScreen())
    }

    fun openHelloSecondToHelloThird() {
        router.navigateTo(Screens.getHelloThirdScreen())
    }
    fun addListHome(workplace: String) {
        viewModelScope.launch { databaseRepository.getList(workplace) }
    }
}
