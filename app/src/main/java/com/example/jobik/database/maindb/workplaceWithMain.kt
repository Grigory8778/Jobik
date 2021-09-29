package com.example.jobik.database.maindb

import androidx.room.Embedded
import androidx.room.Relation
import com.example.jobik.database.workplace.Workplace

data class MainWithWorkplace(
    @Embedded
    val workplace: Workplace,
    @Relation(
        parentColumn = "id",
        entityColumn = "mainId"
    )
    val mainAdd: List<MainAdd>
)