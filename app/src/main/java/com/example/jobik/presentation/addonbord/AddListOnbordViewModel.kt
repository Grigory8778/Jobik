package com.example.jobik.presentation.addonbord

import androidx.core.graphics.isWideGamut
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jobik.data.ElementsRepository
import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainPepository
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.database.workplace.Workplace
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.launch
import org.koin.core.component.getScopeId

class AddListOnbordViewModel(
    private val router: Router,
    private val repository: ElementsRepository,
    private val databaseRepository: WorkplaceRepository,
    private val mainDatabase: MainPepository,
) : ViewModel() {
    val dataList: MutableLiveData<List<Item>> = MutableLiveData()
    private val insertId = MutableLiveData<Long>()

    init {
        dataList.value = repository.getElementsAll()
    }

    fun getAdd() = router.navigateTo(Screens.getTimeScreens())
    fun insert(id: Long, name: String) {
        viewModelScope.launch {
            databaseRepository.insert(Workplace(id, name))
        }

    }

    fun insertAll(
        list: List<Item.Elements>,
        idCategory: Long
    ) {
        val newList = list.map { MainAdd(0, it.color, it.color, it.image, it.state, idCategory) }
        viewModelScope.launch {
            mainDatabase.insertList(newList)
        }
    }
}
