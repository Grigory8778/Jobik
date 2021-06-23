package com.example.jobik.Home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
import com.example.jobik.RecAdapter
import com.example.jobik.RecResult

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyc = view.findViewById<RecyclerView>(R.id.recycler_main)
        val layoutManager = LinearLayoutManager(context)
        val adapter = RecAdapter(
            listOf(
                RecResult(
                    "Выключить утюг",
                    R.drawable.ic_icon
                )
            )
        )
        recyc.layoutManager = layoutManager
        recyc.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}