package com.example.jobik.database.workplace

class WorkplaceRepositoryImpl(private val appDatabase: AppDatabase) : WorkplaceRepository {
    override suspend fun getAll(): List<Workplace> = appDatabase.workplaceDao().all()

    override suspend fun insert(workplace: Workplace) = appDatabase.workplaceDao().insert(workplace)

    override suspend fun getById(id: Long): Workplace = appDatabase.workplaceDao().getByID(id)

    override suspend fun update(workplace: Workplace) = appDatabase.workplaceDao().update(workplace)

    override suspend fun delete(workplace: Workplace) = appDatabase.workplaceDao().delete(workplace)
}