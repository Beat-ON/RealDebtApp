package com.beaton.realdebtapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.beaton.realdebtapp.dao.KirimDao
import com.beaton.realdebtapp.model.KirimData
import kotlinx.android.synthetic.main.fragment_kirim.*


@Database(entities = [KirimData::class], version = 1)
abstract class KriimDatabase:RoomDatabase() {

    abstract fun getDao():KirimDao

//    companion object{
//        fun getDB(context: Context): KriimDatabase {
//            return Room.databaseBuilder(
//                context.applicationContext,
//                KriimDatabase::class.java,
//                "qarizlar"
//            ).build()
//
//        }
//    }

}