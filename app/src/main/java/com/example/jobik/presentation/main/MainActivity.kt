package com.example.jobik.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jobik.R
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.hellionbord.HelloOnbordViewModel
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<MainViewModel>()
    private val navigatorHolder by inject<NavigatorHolder>()
    private val router by inject<Router> ()
    private val presenter by lazy { MainViewModel(router) }
    private val navigator: Navigator by lazy {
        AppNavigator(this, R.id.main_cont)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.getOpenHome()
    }

    override fun onResume() {
        super.onResume()
       navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}