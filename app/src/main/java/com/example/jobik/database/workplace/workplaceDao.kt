package com.example.jobik.database.workplace

import androidx.room.*
import com.example.jobik.database.maindb.MainWithWorkplace

@Dao
interface WorkplaceDao {
    @Query("SELECT * FROM workplace")
    suspend fun all(): List<Workplace>

    @Insert
    suspend fun insert(workplace: Workplace):Long

    @Query("SELECT * FROM workplace WHERE id =:id")
    suspend fun getByID(id: Long): Workplace

    @Update()
    suspend fun update(workplace: Workplace)

    @Delete
    suspend fun delete(workplace: Workplace)

    @Transaction
    @Query("SELECT * FROM Workplace")
    suspend fun workplaceWithMain(): List<MainWithWorkplace>

}