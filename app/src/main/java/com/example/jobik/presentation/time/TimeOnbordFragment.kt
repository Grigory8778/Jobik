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
import com.example.jobik.data.LocalRepository
import com.example.jobik.data.LocalRepositoryImpl

class TimeOnbordFragment : Fragment(), TimeOnbordView {
    private val presenter by lazy {
        TimeOnbordPresenter(
            App.INSTANCE.router,
            LocalRepositoryImpl(App.INSTANCE.sharedPreferences), this
        )
    }
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
        presenter.initial()
        val btn = view.findViewById<Button>(R.id.btn_time)
        btn.setOnClickListener {
            presenter.saveMin(timePicker?.minute ?: 0)
            presenter.saveHour(timePicker?.hour ?: 0)
            presenter.saveStatus(false)
            presenter.openMain()
        }
    }

    override fun setMin(mint: Int) {
        timePicker?.minute = mint
    }

    override fun setHour(hour: Int) {
        timePicker?.hour = hour
    }
}