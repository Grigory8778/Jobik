package com.example.jobik.addList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ToggleButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.App
import com.example.jobik.R
import com.example.jobik.RecAdapter
import com.example.jobik.RecResult

class AddListOnbordFragment : Fragment() {
    private val presenter by lazy { AddListOnbordPresenter(App.INSTANCE.router) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_list_onbord, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rec = view.findViewById<RecyclerView>(R.id.recycler)
        val layoutManager = LinearLayoutManager(context)
        val toggleButton=view.findViewById<ToggleButton>(R.id.tgb)
        val adapter = RecAdapter(
            listOf(
                RecResult(
                    "Утюг",
                    R.drawable.ic_iron
                )
            )
        )
        rec.layoutManager = layoutManager
        rec.adapter = adapter
        val btn = view.findViewById<Button>(R.id.btn_add)
        btn.setOnClickListener {
            presenter.getAdd()
        }
    }
}