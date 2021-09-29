package com.example.jobik.database.workplace

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainDao

@Database(entities = [Workplace::class, MainAdd::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun workplaceDao(): WorkplaceDao
    abstract fun mainDao(): MainDao
}

