package com.example.jobik.navigation

import com.example.jobik.addList.AddListOnbordFragment
import com.example.jobik.hello.HelloOnbordFragment
import com.example.jobik.time.TimeOnbordFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun getHelloScreens() = FragmentScreen { HelloOnbordFragment() }
    fun getTimeScreens() = FragmentScreen { TimeOnbordFragment() }
    fun getAddListScreens() = FragmentScreen { AddListOnbordFragment() }


}