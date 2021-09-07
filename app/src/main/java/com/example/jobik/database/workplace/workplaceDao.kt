package com.example.jobik.database.workplace

import androidx.room.*

@Dao
interface WeatherDao {
    @Query("SELECT * FROM workplace")
    suspend fun all(): List<Workplace>

    @Insert
    suspend fun insert(workplace: Workplace)

    @Query("SELECT * FROM workplace WHERE id =:id")
    suspend fun getByID(id: Long): Workplace

    @Update()
    suspend fun update(workplace: Workplace)

    @Delete
    suspend fun delete(workplace: Workplace)
}