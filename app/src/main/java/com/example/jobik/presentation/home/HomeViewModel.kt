package com.example.jobik.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.database.maindb.MainWithWorkplace
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.launch

class HomeViewModel(
    private val router: Router,
    private val databaseRepository: WorkplaceRepository,
) : ViewModel() {
    val dataList: MutableLiveData<MainWithWorkplace> = MutableLiveData()

    fun openHomeToSheet() {
        router.navigateTo(Screens.getSheet())
    }

    fun addListHome(name: String) {
        viewModelScope.launch {
            dataList.value = databaseRepository.getList(name)
        }
    }
}
