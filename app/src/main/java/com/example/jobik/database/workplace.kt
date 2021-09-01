package com.example.jobik.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Workplace(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var name: String? = null
)