package com.beaton.realdebtapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "qarizlar")
data class KirimData (
        @PrimaryKey val id:Int,
        @ColumnInfo(name = "from_came") val firstCame:String,
        @ColumnInfo(name = "summa") val summa:String,
        @ColumnInfo(name = "date") val date:String,
        @ColumnInfo(name = "description") val description:String,
        )