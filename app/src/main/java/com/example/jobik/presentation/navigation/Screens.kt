package com.example.jobik.navigation

import android.content.Intent
import com.example.jobik.Home.HomeFragment
import com.example.jobik.Home.sheet.BottomSheetFragment
import com.example.jobik.presentation.Main.MainActivity
import com.example.jobik.SheetActivity
import com.example.jobik.addList.AddListOnbordFragment
import com.example.jobik.hello.OnboardHelleStepFragmetOne
import com.example.jobik.hello.OnboardHelleStepFragmetSecond
import com.example.jobik.presentation.hellionbord.OnboardHelloStepFragmetThird
import com.example.jobik.presentation.onbord.OnbordActivity
import com.example.jobik.presentation.time.TimeOnbordFragment
import com.github.terrakok.cicerone.androidx.ActivityScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen


object Screens {
    fun getHelloThirdScreen() = FragmentScreen { OnboardHelloStepFragmetThird() }
    fun getHelloSecondScreen() = FragmentScreen { OnboardHelleStepFragmetSecond() }
    fun getHelloOneScreens() = FragmentScreen { OnboardHelleStepFragmetOne() }
    fun getTimeScreens() = FragmentScreen { TimeOnbordFragment() }
    fun getAddListScreens() = FragmentScreen { AddListOnbordFragment() }
    fun getMainScreens() = ActivityScreen { Intent(it, MainActivity::class.java) }
    fun getOnbornScreens() = ActivityScreen { Intent(it, OnbordActivity::class.java) }
    fun getHomeScreens() = FragmentScreen { HomeFragment() }
    fun getSheet() = FragmentScreen { BottomSheetFragment() }
    fun getMainSheet() = ActivityScreen { Intent(it, SheetActivity::class.java) }


}