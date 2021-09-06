package com.example.jobik.presentation.hellionbord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jobik.R
import com.example.jobik.presentation.addonbord.AddListOnbordViewModel
import com.example.jobik.presentation.base.App
import org.koin.androidx.viewmodel.ext.android.viewModel


class OnboardHelleStepFragmetOne:Fragment() {
    private val viewModel by viewModel<HelloOnbordViewModel>()
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
            viewModel.getHelloOneToHelloSecond()
        }
        txtSkip.setOnClickListener {
            viewModel.getHelloToAddScreens()
        }
    }
}