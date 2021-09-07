package com.example.jobik.database.workplace

class WorkplaceRepositoryImpl(private val appDatabase: AppDatabase) : WorkplaceRepository {
    override suspend fun getAll(): List<Workplace> = appDatabase.weatherDao().all()

    override suspend fun insert(workplace: Workplace) = appDatabase.weatherDao().insert(workplace)

    override suspend fun getById(id: Long): Workplace = appDatabase.weatherDao().getByID(id)

    override suspend fun update(workplace: Workplace) = appDatabase.weatherDao().update(workplace)

    override suspend fun delete(workplace: Workplace) = appDatabase.weatherDao().delete(workplace)
}