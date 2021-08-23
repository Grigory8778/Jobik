package com.example.jobik.presentation.onbord

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jobik.presentation.base.App
import com.example.jobik.R
import com.example.jobik.data.LocalRepositoryImpl
import com.github.terrakok.cicerone.androidx.AppNavigator


class OnbordActivity : AppCompatActivity() {
    private val presenter by lazy {
        OnbordPresenter(
            App.INSTANCE.router,
            LocalRepositoryImpl(App.INSTANCE.sharedPreferences)
        )
    }
    private val navigator by lazy { AppNavigator(this, R.id.frame_cont) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_main)
        presenter.saveData()
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