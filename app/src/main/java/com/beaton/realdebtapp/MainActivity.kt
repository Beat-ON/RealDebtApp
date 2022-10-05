package com.beaton.realdebtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beaton.realdebtapp.controller.KirimController
import com.beaton.realdebtapp.database.KriimDatabase
import com.beaton.realdebtapp.fragments.KirimFragment
import com.beaton.realdebtapp.model.KirimData
import kotlinx.android.synthetic.main.item_menu.*
import kotlinx.android.synthetic.main.kirim_dialog.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contoller_nav = KirimController(this, KirimFragment(this))
        val kirimFragment = KirimFragment(this)
        contoller_nav.nav_press()
        kirimFragment.add_button_working()
        contoller_nav.save_bottom_kirim()






    }
}