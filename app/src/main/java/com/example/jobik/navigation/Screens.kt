package com.example.jobik.navigation

import android.content.Intent
import com.example.jobik.Main.MainActivity
import com.example.jobik.addList.AddListOnbordFragment
import com.example.jobik.hello.HelloOnbordFragment
import com.example.jobik.onbord.OnbordActivity
import com.example.jobik.time.TimeOnbordFragment
import com.github.terrakok.cicerone.androidx.ActivityScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun getHelloScreens() = FragmentScreen { HelloOnbordFragment() }
    fun getTimeScreens() = FragmentScreen { TimeOnbordFragment() }
    fun getAddListScreens() = FragmentScreen { AddListOnbordFragment() }
    fun getMainA() = ActivityScreen { Intent(it, MainActivity::class.java) }
    fun getOnbornA() = ActivityScreen { Intent(it, OnbordActivity::class.java) }
}