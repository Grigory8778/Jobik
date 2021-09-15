package com.example.jobik.database.maindb

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.jobik.presentation.base.Item

@Entity
data class MainAdd(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var color: Int,
    var image: Int,
    var name: Int,
    var state: Boolean,
    var mainId: Long
)