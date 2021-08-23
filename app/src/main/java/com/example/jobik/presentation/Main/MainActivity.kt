package com.example.jobik.presentation.Main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jobik.R
import com.example.jobik.presentation.Main.MainPresenter
import com.example.jobik.presentation.base.App
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivity : AppCompatActivity() {
    private val presenter by lazy { MainPresenter(App.INSTANCE.router) }
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
        App.INSTANCE.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        App.INSTANCE.navigatorHolder.removeNavigator()
        super.onPause()
    }
}