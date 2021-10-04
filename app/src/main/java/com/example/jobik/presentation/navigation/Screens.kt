package com.example.jobik.presentation.navigation

import android.content.Intent
import com.example.jobik.Home.sheet.BottomSheetFragment
import com.example.jobik.presentation.addonbord.AddListOnbordFragment
import com.example.jobik.presentation.hellionbord.OnboardHelleStepOneFragmet
import com.example.jobik.presentation.hellionbord.OnboardHelleStepSecondFragmet
import com.example.jobik.presentation.hellionbord.OnboardHelloStepThirdFragmet
import com.example.jobik.presentation.home.HomeFragment
import com.example.jobik.presentation.main.MainActivity
import com.example.jobik.presentation.onbord.OnbordActivity
import com.example.jobik.presentation.time.TimeOnbordFragment
import com.github.terrakok.cicerone.androidx.ActivityScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen


object Screens {
    fun getHelloThirdScreen() = FragmentScreen { OnboardHelloStepThirdFragmet() }
    fun getHelloSecondScreen() = FragmentScreen { OnboardHelleStepSecondFragmet() }
    fun getHelloOneScreens() = FragmentScreen { OnboardHelleStepOneFragmet() }
    fun getTimeScreens() = FragmentScreen { TimeOnbordFragment() }
    fun getAddListScreens() = FragmentScreen { AddListOnbordFragment() }
    fun getMainScreens() = ActivityScreen { Intent(it, MainActivity::class.java) }
    fun getOnboardScreens() = ActivityScreen { Intent(it, OnbordActivity::class.java) }
    fun getHomeScreens() = FragmentScreen { HomeFragment() }
    fun getSheet() = FragmentScreen { BottomSheetFragment() }

}