package com.beaton.realdebtapp.dao

import androidx.room.Dao
import androidx.room.Query
import com.beaton.realdebtapp.model.KirimData


@Dao
interface KirimDao {
    @Query("select * from qarizlar")
    fun getAllQarizlar():List<KirimData>
}