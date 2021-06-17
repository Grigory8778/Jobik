package com.example.jobik.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.jobik.App
import com.example.jobik.R

class HelloOnbordFragment : Fragment() {
    private val presenter by lazy { HelloOnbordPresenter(App.INSTANCE.router) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hello_onbord, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn = view.findViewById<Button>(R.id.btn_hello)
        btn.setOnClickListener {
            presenter.getHello()
        }
    }

}