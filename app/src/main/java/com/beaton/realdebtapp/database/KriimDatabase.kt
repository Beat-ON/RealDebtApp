package com.beaton.realdebtapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beaton.realdebtapp.dao.KirimDao
import com.beaton.realdebtapp.model.KirimData


@Database(entities = [KirimData::class], version = 1)
abstract class KriimDatabase:RoomDatabase() {

    abstract fun getDao():KirimDao

}