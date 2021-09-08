package com.example.jobik.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jobik.R
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

    private val navigator: Navigator by lazy {
        AppNavigator(this, R.id.main_container)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.openHome()
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