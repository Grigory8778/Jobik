package com.example.jobik.database.maindb

import androidx.room.*


@Dao
interface MainDao {
    @Query("SELECT * FROM mainadd")
    suspend fun all(): List<MainAdd>

    @Insert
    suspend fun insert(workplace: MainAdd)

    @Query("SELECT * FROM mainadd WHERE id =:id")
    suspend fun getByID(id: Long): MainAdd

    @Update()
    suspend fun update(workplace: MainAdd)

    @Delete
    suspend fun delete(workplace: MainAdd)
}