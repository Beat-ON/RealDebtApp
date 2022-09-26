package com.beaton.realdebtapp.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beaton.realdebtapp.MainActivity
import com.beaton.realdebtapp.R
import com.beaton.realdebtapp.controller.KirimController
import com.beaton.realdebtapp.database.KriimDatabase
import com.beaton.realdebtapp.recyclerview.KirimAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_kirim.*
import kotlinx.android.synthetic.main.kirim_dialog.*


class KirimFragment(val activity: MainActivity) : Fragment(R.layout.fragment_kirim) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var adapter = KirimAdapter()
        rv_kirim.adapter = adapter

        val start = KirimController(activity,this)
        start.run()
    }

    fun add_button_working(){
        activity.add_button.setOnClickListener {
            val builder = Dialog(activity)
            val inflater = activity.layoutInflater

            builder.setContentView(inflater.inflate(R.layout.kirim_dialog,null))
            builder.setCancelable(true)
            builder.show()
        }
    }


}