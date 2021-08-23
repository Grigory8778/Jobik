package com.example.jobik.Home

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.view.menu.MenuView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.App
import com.example.jobik.Home.sheet.BottomSheetFragment
import com.example.jobik.Item
import com.example.jobik.R
import com.example.jobik.RecMainAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
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
    }
}