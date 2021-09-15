package com.example.jobik.presentation.addonbord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
import com.example.jobik.database.workplace.Workplace
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.onbord.RecAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddListOnbordFragment : Fragment() {
    private val adapter = RecAdapter()
    private val viewModel by viewModel<AddListOnbordViewModel>()

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
        rec.layoutManager = layoutManager
        rec.adapter = adapter

        viewModel.dataList.observe(viewLifecycleOwner) { list ->
            adapter.setList(list)
        }
        viewModel.dataList.observe(viewLifecycleOwner) { list ->
            adapter.getTrueElements(list)
        }


        val btn = view.findViewById<Button>(R.id.btn_add)
        btn.setOnClickListener {
            viewModel.getAdd()
            viewModel.insert(1, R.string.house.toString())
            viewModel.insert(2, R.string.work.toString())
        }
    }
}


