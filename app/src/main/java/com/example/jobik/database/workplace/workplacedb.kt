package com.example.jobik.database.workplace

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Workplace::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun workplaceDao(): WorkplaceDao
}

