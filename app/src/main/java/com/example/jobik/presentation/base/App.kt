package com.example.jobik.presentation.base

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.jobik.data.ResourceProvider
import com.example.jobik.database.AppDatabase
import com.example.jobik.di.appModule
import com.github.terrakok.cicerone.Cicerone
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
//    lateinit var resourceProvider: ResourceProvider
//    lateinit var sharedPreferences: SharedPreferences
//    lateinit var database: AppDatabase
//    private val cicerone = Cicerone.create()
//    val router get() = cicerone.router
//    val navigatorHolder get() = cicerone.getNavigatorHolder()
    override fun onCreate() {
        super.onCreate()
//        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
//        resourceProvider = ResourceProvider(this)
//        database = Room.databaseBuilder(this, AppDatabase::class.java, "database")
//            .fallbackToDestructiveMigration()
//            .build()
        startKoin {
            androidLogger()
            androidContext(this@App)
            androidFileProperties()
            modules(appModule)
        }
    }
}