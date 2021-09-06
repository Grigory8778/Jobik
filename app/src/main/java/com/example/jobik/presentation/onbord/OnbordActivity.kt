package com.example.jobik.presentation.onbord

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jobik.presentation.base.App
import com.example.jobik.R
import com.example.jobik.data.TimeRepositoryImpl
import com.example.jobik.presentation.main.MainViewModel
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class OnbordActivity : AppCompatActivity() {
    private val viewModel by viewModel<OnbordActivityViewModel>()
    private val navigatorHolder by inject<NavigatorHolder>()
    private val navigator by lazy { AppNavigator(this, R.id.frame_cont) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_main)
        viewModel.saveData()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
      navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }


}