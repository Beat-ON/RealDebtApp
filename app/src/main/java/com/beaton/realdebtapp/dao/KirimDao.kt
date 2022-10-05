package com.beaton.realdebtapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beaton.realdebtapp.model.KirimData


@Dao
interface KirimDao {

    @Insert
    fun insert(kirimITEMS: KirimData)
    @Query("select * from qarizlar")
    fun getAllKirim():List<KirimData>

}