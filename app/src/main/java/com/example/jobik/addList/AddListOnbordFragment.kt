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
import com.example.jobik.*

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
                R.drawable.ic_ellipse_yellow
            ),
            Item.Elements(
                "Компьютер",
                R.drawable.ic_pc,
                R.drawable.ic_ellipse_yellow
            ),
            Item.Elements(
                "Сплит-система",
                R.drawable.ic_split,
                R.drawable.ic_ellipse_yellow
            ),
            Item.Elements(
                "Утюжок",
                R.drawable.ic_curling_iron,
                R.drawable.ic_ellipse_yellow
            ),
            Item.Title("Коммунальные услуги"),
            Item.Elements(
                "Свет",
                R.drawable.ic_light,
                R.drawable.ic_ellipse_turquoise
            ),
            Item.Elements(
                "Вода",
                R.drawable.ic_water,
                R.drawable.ic_ellipse_turquoise
            ),
            Item.Elements(
                "Газ",
                R.drawable.ic_gas,
                R.drawable.ic_ellipse_turquoise
            ),
            Item.Title("На выходе"),
            Item.Elements(
                "Окна",
                R.drawable.ic_window,
                R.drawable.ic_ellipse_blue
            ),
            Item.Elements(
                "Дверь",
                R.drawable.ic_door,
                R.drawable.ic_ellipse_blue
            ),
            Item.Elements(
                "Сигнализация",
                R.drawable.ic_alarm,
                R.drawable.ic_ellipse_blue
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