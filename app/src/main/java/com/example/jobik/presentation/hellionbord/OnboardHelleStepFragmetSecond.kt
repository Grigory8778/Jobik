package com.example.jobik.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jobik.R
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.hellionbord.HelloOnbordPresenter

class OnboardHelleStepFragmetSecond: Fragment() {
    private val presenter by lazy { HelloOnbordPresenter(App.INSTANCE.router) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onbord_hello_step_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext = view.findViewById<Button>(R.id.btn_second_next)
        val txtSkip= view.findViewById<TextView>(R.id.txt_second_skip)
        btnNext.setOnClickListener {
            presenter.getHelloSecondToHelloThird()
        }
        txtSkip.setOnClickListener {
            presenter.getHelloToAddScreens()
        }
    }
}
