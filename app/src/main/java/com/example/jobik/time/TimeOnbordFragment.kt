package com.example.jobik.time

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.jobik.App
import com.example.jobik.R

class TimeOnbordFragment : Fragment() {
    private val presenter by lazy { TimeOnbordPresenter(App.INSTANCE.router) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.time_onbord, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val timePicker=view.findViewById<TimePicker>(R.id.time_picker)
        val btn = view.findViewById<Button>(R.id.btn_time)
        btn.setOnClickListener {
            Toast.makeText(requireContext(), "ВСЕ.Это последний экран", Toast.LENGTH_SHORT).show()
        }
        timePicker.setIs24HourView(true)
    }
}