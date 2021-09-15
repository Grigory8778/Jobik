package com.example.jobik.di

import android.content.Context
import androidx.room.Room
import com.example.jobik.data.*
import com.example.jobik.database.maindb.MainRepository
import com.example.jobik.database.maindb.MainRepositoryImpl
import com.example.jobik.database.workplace.AppDatabase
import com.example.jobik.database.workplace.WorkplaceRepository
import com.example.jobik.database.workplace.WorkplaceRepositoryImpl
import com.example.jobik.presentation.addonbord.AddListOnbordViewModel
import com.example.jobik.presentation.hellionbord.HelloOnbordViewModel
import com.example.jobik.presentation.home.HomeViewModel
import com.example.jobik.presentation.main.MainViewModel
import com.example.jobik.presentation.onbord.OnbordActivityViewModel
import com.example.jobik.presentation.time.TimeOnbordViewModel
import com.github.terrakok.cicerone.Cicerone
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    val cicerone = Cicerone.create()

    single { Room.databaseBuilder(get(), AppDatabase::class.java, "database").build() }
    single { ResourceProvider(get()) }
    single { get<Context>().getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE) }
    single<WorkplaceRepository> { WorkplaceRepositoryImpl(get()) }
    single<MainRepository> { MainRepositoryImpl(get()) }
    single<ElementsRepository> { ElementsRepositoryImpl(get()) }
    single<TimeRepository> { TimeRepositoryImpl(get()) }
    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }
    viewModel { AddListOnbordViewModel(get(), get(), get(),get()) }
    viewModel { HelloOnbordViewModel(get(),get(),get()) }
    viewModel { MainViewModel(get()) }
    viewModel { OnbordActivityViewModel(get(),get()) }
    viewModel { TimeOnbordViewModel(get(),get()) }
    viewModel { HomeViewModel(get()) }
}