package com.example.jobik.database

import androidx.room.*

@Dao
interface WeatherDao {
    @Query("SELECT * FROM workplace")
    suspend fun all(): List<Workplace>

    @Insert
    fun insert(workplace: Workplace)

    @Query("SELECT * FROM workplace WHERE id =:id")
    suspend fun getByID(id: Long): Workplace

    @Update()
    fun update(workplace: Workplace)

    @Delete
    fun delete(workplace: Workplace)
}