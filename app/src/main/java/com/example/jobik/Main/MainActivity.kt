package com.example.jobik.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobik.App
import com.example.jobik.R
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivity : AppCompatActivity() {
    private val navigator: Navigator by lazy {  AppNavigator(this, R.id.main_cont)  }
    private val router: Router by lazy { App.INSTANCE.router }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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