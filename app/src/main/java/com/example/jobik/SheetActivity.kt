package com.example.jobik

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.jobik.Home.sheet.BottomSheetFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton


class SheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_layout)
        val addBat = findViewById<FloatingActionButton>(R.id.add_butt_draw)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolmain_drawer)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        toolbar.setNavigationOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }
        addBat.setOnClickListener {
            val modalbottomSheetFragment = BottomSheetFragment()
            modalbottomSheetFragment.show(supportFragmentManager, modalbottomSheetFragment.tag)
        }
    }
}
