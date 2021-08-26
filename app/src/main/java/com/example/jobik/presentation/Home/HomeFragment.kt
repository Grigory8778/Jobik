package com.example.jobik.Home

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
import com.example.jobik.presentation.Home.HomePresenter
import com.example.jobik.presentation.Main.RecMainAdapter
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.base.Item
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeFragment : Fragment() {
    private val presenter by lazy { HomePresenter(App.INSTANCE.router) }
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
               presenter.getMainSheet()
        }

        resyc.layoutManager = layoutManager
        resyc.adapter = adapter
        adapter.setList(
            listOf(
                Item.Elements(
                    "Утюг",
                    R.drawable.ic_iron,
                    ContextCompat.getColor(requireContext(),R.color.yellow)
                ),
                Item.Elements(
                    "Компьютер",
                    R.drawable.ic_pc,
                    ContextCompat.getColor(requireContext(),R.color.yellow)
                ),
                Item.Elements(
                    "Сплит-система",
                    R.drawable.ic_split,
                    ContextCompat.getColor(requireContext(),R.color.yellow)
                ),
                Item.Elements(
                    "Утюжок",
                    R.drawable.ic_curling_iron,
                    ContextCompat.getColor(requireContext(),R.color.yellow)
                ),
                Item.Elements(
                    "Свет",
                    R.drawable.ic_light,
                    ContextCompat.getColor(requireContext(),R.color.green_blue)
                ),
                Item.Elements(
                    "Вода",
                    R.drawable.ic_water,
                    ContextCompat.getColor(requireContext(),R.color.green_blue)
                ),
                Item.Elements(
                    "Газ",
                    R.drawable.ic_gas,
                    ContextCompat.getColor(requireContext(),R.color.green_blue)
                ),
                Item.Elements(
                    "Окна",
                    R.drawable.ic_window,
                    ContextCompat.getColor(requireContext(),R.color.blue)
                ),
                Item.Elements(
                    "Дверь",
                    R.drawable.ic_door,
                    ContextCompat.getColor(requireContext(),R.color.blue)
                ),
                Item.Elements(
                    "Сигнализация",
                    R.drawable.ic_alarm,
                    ContextCompat.getColor(requireContext(),R.color.blue)
                )
            )
        )
    }
}