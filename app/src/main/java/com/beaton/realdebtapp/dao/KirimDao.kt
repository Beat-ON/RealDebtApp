package com.beaton.realdebtapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.beaton.realdebtapp.model.KirimData


@Dao
interface KirimDao {
    @Query("select * from qarizlar")
    fun getAllKirim():List<KirimData>
    @Insert
    fun insert(insertKirim:KirimData)
}