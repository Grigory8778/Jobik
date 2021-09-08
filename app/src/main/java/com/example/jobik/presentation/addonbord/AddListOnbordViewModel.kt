package com.example.jobik.presentation.addonbord

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.data.ElementsRepository
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
) : ViewModel() {
    val dataList: MutableLiveData<List<Item>> = MutableLiveData()

    init {
        dataList.value = repository.getElements()
    }

    fun getAdd() = router.navigateTo(Screens.getTimeScreens())
    fun insert(id: Long, name: Int) {
        viewModelScope.launch {
            databaseRepository.insert(Workplace(id, name))
        }
    }


}
