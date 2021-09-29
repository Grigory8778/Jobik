package com.example.jobik.database.maindb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MainAdd(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var color: Int,
    var image: Int,
    var name: String,
    var state: Boolean,
    var mainId: Long
)