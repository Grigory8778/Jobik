package com.example.jobik.data

import com.example.jobik.presentation.base.Item

interface ElementsRepository {
    fun getElements(): List<Item>
}