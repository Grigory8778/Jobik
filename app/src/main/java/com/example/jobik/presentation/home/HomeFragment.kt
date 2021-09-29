package com.example.jobik.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.main.RecMainAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {
    private val viewModel by viewModel<HomeViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.toolmain)
        val addBat = view.findViewById<FloatingActionButton>(R.id.add_butt)
        val resyc = view.findViewById<RecyclerView>(R.id.recycler_main)
        val layoutManager = LinearLayoutManager(context)
        val adapter = RecMainAdapter()
        addBat.setOnClickListener {
            viewModel.openMainSheet()
        }
        viewModel.addListHome(getString(R.string.house))
        viewModel.dataList.observe(viewLifecycleOwner) { model ->
            adapter.setList(model.mainAdd.map {
                Item.Elements(
                    name = it.name,
                    image = it.image,
                    color = it.color
                )
            })
            toolbar.title = model.workplace.name
        }
        resyc.layoutManager = layoutManager
        resyc.adapter = adapter

    }
}