package com.example.jobik.database.maindb

import androidx.room.*


@Dao
interface MainDao {
    @Query("SELECT * FROM mainadd")
    suspend fun all(): List<MainAdd>

    @Insert
    suspend fun insert(mainAdd: MainAdd)

    @Insert
    suspend fun insertList(mainAdd: List<MainAdd>)

    @Query("SELECT * FROM mainadd WHERE id =:id")
    suspend fun getByID(id: Long): MainAdd

    @Update()
    suspend fun update(mainAdd: MainAdd)

    @Delete
    suspend fun delete(mainAdd: MainAdd)
//    @Query("SELECT id FROM table_name WHERE rowid = :rowId")
//    suspend fun
}