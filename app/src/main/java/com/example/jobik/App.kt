package com.example.jobik

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.github.terrakok.cicerone.Cicerone

class App:Application() {
    var bool = false
    lateinit var sharedPreferences: SharedPreferences
    private val cicerone = Cicerone.create()
    val router get() = cicerone.router
    val navigatorHolder get() = cicerone.getNavigatorHolder()
    override fun onCreate() {
            super.onCreate()
        INSTANCE = this
        sharedPreferences=getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        bool = sharedPreferences.getBoolean("bool",true)
    }

    companion object {
         private val APP_PREFERENCES:String="APP_PREFERENCES"

        internal lateinit var INSTANCE: App
            private set
    }

}