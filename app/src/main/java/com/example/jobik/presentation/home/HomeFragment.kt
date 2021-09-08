package com.example.jobik.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
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
        val addBat = view.findViewById<FloatingActionButton>(R.id.add_butt)
        val resyc = view.findViewById<RecyclerView>(R.id.recycler_main)
        val layoutManager = LinearLayoutManager(context)
        val adapter = RecMainAdapter()
        addBat.setOnClickListener {
            viewModel.openMainSheet()
        }
        resyc.layoutManager = layoutManager
        resyc.adapter = adapter
        adapter.setList(
            listOf(
                Item.Elements(
                    R.string.iron,
                    R.drawable.ic_iron,
                    ContextCompat.getColor(requireContext(), R.color.yellow)
                ),
                Item.Elements(
                    R.string.computer,
                    R.drawable.ic_pc,
                    ContextCompat.getColor(requireContext(), R.color.yellow)
                ),
                Item.Elements(
                    R.string.split,
                    R.drawable.ic_split,
                    ContextCompat.getColor(requireContext(), R.color.yellow)
                ),
                Item.Elements(
                    R.string.rectifier,
                    R.drawable.ic_curling_iron,
                    ContextCompat.getColor(requireContext(), R.color.yellow)
                ),
                Item.Elements(
                    R.string.light,
                    R.drawable.ic_light,
                    ContextCompat.getColor(requireContext(), R.color.green_blue)
                ),
                Item.Elements(
                    R.string.water,
                    R.drawable.ic_water,
                    ContextCompat.getColor(requireContext(), R.color.green_blue)
                ),
                Item.Elements(
                    R.string.gas,
                    R.drawable.ic_gas,
                    ContextCompat.getColor(requireContext(), R.color.green_blue)
                ),

                Item.Elements(
                    R.string.window,
                    R.drawable.ic_window,
                    ContextCompat.getColor(requireContext(), R.color.blue)
                ),
                Item.Elements(
                    R.string.door,
                    R.drawable.ic_door,
                    ContextCompat.getColor(requireContext(), R.color.blue)
                ),
                Item.Elements(
                    R.string.signaling,
                    R.drawable.ic_alarm,
                    ContextCompat.getColor(requireContext(), R.color.blue)
                )
            )
        )
    }
}