package com.example.jobik.data

import com.example.jobik.presentation.base.Item

interface ElementsRepository {
    fun getElementsAll(): List<Item>
    fun getElements(): List<Item.Elements>
}