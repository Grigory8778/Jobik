package com.example.jobik.database.workplace

import com.example.jobik.database.maindb.MainAdd
import com.example.jobik.database.maindb.MainWithWorkplace
import com.example.jobik.presentation.base.Item

class WorkplaceRepositoryImpl(private val appDatabase: AppDatabase) : WorkplaceRepository {
    override suspend fun getAll(): List<Workplace> = appDatabase.workplaceDao().all()

    override suspend fun insert(workplace: Workplace) = appDatabase.workplaceDao().insert(workplace)
    override suspend fun insertLis(mainAdd: List<MainAdd>) =
        appDatabase.mainDao().insertList(mainAdd)
    override suspend fun getById(id: Long): Workplace = appDatabase.workplaceDao().getByID(id)
    override suspend fun update(workplace: Workplace) = appDatabase.workplaceDao().update(workplace)
    override suspend fun delete(workplace: Workplace) = appDatabase.workplaceDao().delete(workplace)
    override suspend fun click(workplace: String, list: List<Item.Elements>) {
        val idCategory = insert(Workplace(0, workplace))
        val newList =
            list.map { MainAdd(0, it.color, it.color, it.image.toString(), it.state, idCategory) }
        insertLis(newList)
    }
    override suspend fun getList(name: String): MainWithWorkplace {
        val newList = appDatabase.workplaceDao().workplaceWithMain(name)
        return newList
    }
}
