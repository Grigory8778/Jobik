package com.example.jobik.database.maindb

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [MainAdd::class], version = 1)
abstract class AppMainDatabase : RoomDatabase() {
    abstract fun mainDao(): MainDao
}