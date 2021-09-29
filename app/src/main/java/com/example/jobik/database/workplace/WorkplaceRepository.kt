package com.example.jobik.database.workplace

import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainWithWorkplace
import com.example.jobik.presentation.base.Item

interface WorkplaceRepository {
    suspend fun getAll(): List<Workplace>
    suspend fun insert(workplace: Workplace): Long
    suspend fun insertLis(mainAdd: List<MainAdd>)
    suspend fun getById(id: Long): Workplace
    suspend fun update(workplace: Workplace)
    suspend fun delete(workplace: Workplace)
    suspend fun click(workplace: String,list: List<Item.Elements>)
    suspend fun getList (name: String,):MainWithWorkplace
}