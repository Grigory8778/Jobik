package com.example.jobik.presentation.base

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jobik.data.ResourceProvider
import com.example.jobik.database.AppDatabase
import com.github.terrakok.cicerone.Cicerone

class App : Application() {
    lateinit var resourceProvider: ResourceProvider
    lateinit var sharedPreferences: SharedPreferences
    lateinit var database: AppDatabase
    private val cicerone = Cicerone.create()
    val router get() = cicerone.router
    val navigatorHolder get() = cicerone.getNavigatorHolder()
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        resourceProvider = ResourceProvider(this)
        database = Room.databaseBuilder(this, AppDatabase::class.java, "database")
            .fallbackToDestructiveMigration()
            .build()
    }

    companion object {
        private val APP_PREFERENCES: String = "APP_PREFERENCES"

        internal lateinit var INSTANCE: App
            private set
    }

}