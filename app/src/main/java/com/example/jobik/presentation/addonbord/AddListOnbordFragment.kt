package com.example.jobik.presentation.addonbord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.RestrictTo
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobik.R
import com.example.jobik.data.ElementsRepositoryImpl
import com.example.jobik.database.Workplace
import com.example.jobik.presentation.base.App
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.onbord.RecAdapter
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.koin.androidx.scope.LifecycleScopeDelegate
import org.koin.androidx.scope.lifecycleScope


class AddListOnbordFragment : Fragment(), AddListOnbordView {
    private val adapter = RecAdapter()
    private val presenter by lazy { AddListOnbordPresenter(App.INSTANCE.router,ElementsRepositoryImpl(App.INSTANCE.resourceProvider),this) }

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
        presenter.getList()
        val btn = view.findViewById<Button>(R.id.btn_add)
        btn.setOnClickListener {
            presenter.getAdd()
            GlobalScope.launch {
                App.INSTANCE.database.workplaceDao().insert(Workplace(1,"Дом"))
            }
        }
    }

    override fun showList(List: List<Item>) {
        adapter.setList(List)
    }
}