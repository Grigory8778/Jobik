package com.example.jobik

import android.widget.Toast
import com.example.jobik.navigation.Screens
import com.github.terrakok.cicerone.Router
import kotlin.contracts.contract
import kotlin.coroutines.coroutineContext

class SamplePresenter(private val router: Router) {
    fun getHello() {
        router.navigateTo(Screens.getAddListScreens())
    }

    fun getAdd() {
        router.navigateTo(Screens.getTimeScreens())
    }

    fun exit() {
        router.exit()
    }
}