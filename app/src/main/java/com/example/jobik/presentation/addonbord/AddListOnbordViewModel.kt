package com.example.jobik.presentation.addonbord

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.data.ElementsRepository
import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainRepository
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.database.workplace.Workplace
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.launch

class AddListOnbordViewModel(
    private val router: Router,
    private val repository: ElementsRepository,
    private val databaseRepository: WorkplaceRepository,
    private val mainDatabase: MainRepository,
) : ViewModel() {
    val dataList: MutableLiveData<List<Item>> = MutableLiveData()

    init {
        dataList.value = repository.getElementsAll()
    }

    fun click(
        workplace: String,
        list: List<Item.Elements>
    ) {
        viewModelScope.launch {
            databaseRepository.click(workplace, list)
            router.navigateTo(Screens.getTimeScreens())
        }
    }

}
