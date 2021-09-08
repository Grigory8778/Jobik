package com.example.jobik.presentation.hellionbord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jobik.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class OnboardHelleStepSecondFragmet : Fragment() {
    private val viewModel by viewModel<HelloOnbordViewModel>()
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
        val txtSkip = view.findViewById<TextView>(R.id.txt_second_skip)
        btnNext.setOnClickListener {
            viewModel.openHelloSecondToHelloThird()
        }
        txtSkip.setOnClickListener {
            viewModel.openHelloToAddScreens()
        }
    }
}
