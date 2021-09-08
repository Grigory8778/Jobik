package com.example.jobik.presentation.time

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import androidx.fragment.app.Fragment
import com.example.jobik.presentation.base.App
import com.example.jobik.R
import com.example.jobik.data.TimeRepositoryImpl
import com.example.jobik.presentation.onbord.OnbordActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class TimeOnbordFragment : Fragment() {
    private val viewModel by viewModel<TimeOnbordViewModel>()
    private val timePicker = view?.findViewById<TimePicker>(R.id.time_picker)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.time_onbord, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TimePicker>(R.id.time_picker).setIs24HourView(true)
        viewModel.initial()
        val btn = view.findViewById<Button>(R.id.btn_time)
        btn.setOnClickListener {
            viewModel.saveMin(timePicker?.minute ?: 0)
            viewModel.saveHour(timePicker?.hour ?: 0)
            viewModel.saveStatus(false)
            viewModel.openMain()
        }
    }
}