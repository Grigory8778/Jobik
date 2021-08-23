package com.example.jobik.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jobik.App
import com.example.jobik.R
import com.example.jobik.time.TimeOnbordPresenter

class OnboardHelleStepFragmetOne:Fragment() {
    private val presenter by lazy { HelloOnbordPresenter(App.INSTANCE.router) }
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.onbord_hello_step_one, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext = view.findViewById<Button>(R.id.btn_one_next)
        val txtSkip= view.findViewById<TextView>(R.id.txt_one_skip)
        btnNext.setOnClickListener {
            presenter.getHelloOneToHelloSecond()
        }
        txtSkip.setOnClickListener {
            presenter.getHelloToAddScreens()
        }
    }
}