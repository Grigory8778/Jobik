package com.example.jobik.onbord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jobik.App
import com.example.jobik.R
import com.github.terrakok.cicerone.androidx.AppNavigator

class OnbordActivity : AppCompatActivity() {
    private val presenter by lazy { OnbordPresenter(App.INSTANCE.router) }
    private val navigator by lazy { AppNavigator(this, R.id.frame_cont) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_main)
        presenter.openHelloOnbord()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        App.INSTANCE.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        App.INSTANCE.navigatorHolder.removeNavigator()
        super.onPause()
    }
}