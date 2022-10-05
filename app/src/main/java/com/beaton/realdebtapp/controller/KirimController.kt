package com.beaton.realdebtapp.controller

import androidx.room.Room
import com.beaton.realdebtapp.MainActivity
import com.beaton.realdebtapp.R
import com.beaton.realdebtapp.dao.KirimDao
import com.beaton.realdebtapp.database.KriimDatabase
import com.beaton.realdebtapp.fragments.KirimFragment
import com.beaton.realdebtapp.model.KirimData
import com.beaton.realdebtapp.recyclerview.KirimAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_kirim.*
import kotlinx.android.synthetic.main.kirim_dialog.*

class KirimController(val mainActivity: MainActivity, val kirimFragment: KirimFragment) {

    var adapter = KirimAdapter()
    lateinit var dao:KirimDao
    fun run(){
        dao = Room.databaseBuilder(
            kirimFragment.activity,
            KriimDatabase::class.java,
            "qarizlar"
        )
            .createFromAsset("qariz.db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
            .getDao()

        adapter.list = dao.getAllKirim().toMutableList()
        mainActivity.rv_kirim.adapter = adapter
    }
    fun nav_press(){
        mainActivity.nav_view.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item_kirim -> mainActivity.supportFragmentManager.beginTransaction().replace(
                    R.id.fl_main,
                    KirimFragment(mainActivity)
                ).commit()
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
    fun save_bottom_kirim(){
        var kirimItems = KirimData(0,
            mainActivity.kd_et_from_came?.text.toString(),
            mainActivity.kd_et_summa?.text.toString(),
            mainActivity.kd_et_date?.text.toString(),
            mainActivity.kd_et_description?.text.toString())


        mainActivity.kd_et_button?.setOnClickListener {
            dao.insert(kirimItems)
        }
    }
}