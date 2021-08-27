package com.example.jobik.addList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ToggleButton
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.*
import com.example.jobik.presentation.addonbord.AddListOnbordPresenter
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.onbord.RecAdapter


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
        val toggleButton = view.findViewById<ToggleButton>(R.id.tgb_one)
        val adapter = RecAdapter()
        adapter.setList(
            listOf(
            Item.Title("Электроприборы"),
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
            Item.Title("Коммунальные услуги"),
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
            Item.Title("На выходе"),
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
        rec.layoutManager = layoutManager
        rec.adapter = adapter
        val btn = view.findViewById<Button>(R.id.btn_add)
        btn.setOnClickListener {
            presenter.getAdd()
        }
    }
}