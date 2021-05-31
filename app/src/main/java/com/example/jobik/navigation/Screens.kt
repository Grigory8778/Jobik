package com.example.jobik.navigation

import com.example.jobik.Add_list_onbord_fragment
import com.example.jobik.Hello_onbord_fragment
import com.example.jobik.Time_onbord_fragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun getHelloScreens() = FragmentScreen { Hello_onbord_fragment() }
    fun getTimeScreens() = FragmentScreen { Time_onbord_fragment() }
    fun getAddListScreens() = FragmentScreen { Add_list_onbord_fragment() }


}