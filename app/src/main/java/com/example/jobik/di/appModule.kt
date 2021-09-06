package com.example.jobik.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jobik.data.*
import com.example.jobik.database.AppDatabase
import com.example.jobik.database.DatabaseRepository
import com.example.jobik.database.DatabaseRepositoryImpl
import com.example.jobik.presentation.addonbord.AddListOnbordViewModel
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.hellionbord.HelloOnbordViewModel
import com.example.jobik.presentation.home.HomeViewModel
import com.example.jobik.presentation.main.MainViewModel
import com.example.jobik.presentation.onbord.OnbordActivityViewModel
import com.example.jobik.presentation.time.TimeOnbordViewModel
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.lang.reflect.Array.get

val appModule = module {
    val cicerone = Cicerone.create()

    single { Room.databaseBuilder(get(), AppDatabase::class.java, "database").build() }
    single { ResourceProvider(get()) }
    single { get<Context>().getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE) }
    single<DatabaseRepository> { DatabaseRepositoryImpl(get()) }
    single<ElementsRepository> { ElementsRepositoryImpl(get()) }
    single<TimeRepository> { TimeRepositoryImpl(get()) }
    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }
    viewModel { AddListOnbordViewModel(get(), get(), get()) }
    viewModel { HelloOnbordViewModel(get()) }
    viewModel { MainViewModel(get()) }
    viewModel { OnbordActivityViewModel(get(),get()) }
    viewModel { TimeOnbordViewModel(get(),get()) }
    viewModel { HomeViewModel(get()) }
}