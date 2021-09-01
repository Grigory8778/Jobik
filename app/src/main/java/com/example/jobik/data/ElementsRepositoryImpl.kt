package com.example.jobik.data


import com.example.jobik.R
import com.example.jobik.presentation.base.Item

class ElementsRepositoryImpl(
     private val resourceProvider: ResourceProvider
):ElementsRepository  {
    override fun getElements(): List<Item> = listOf(
        Item.Title("Электроприборы"),
        Item.Elements(
            "Утюг",
            R.drawable.ic_iron,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Elements(
            "Компьютер",
            R.drawable.ic_pc,
            resourceProvider.getColor( R.color.yellow)
        ),
        Item.Elements(
            "Сплит-система",
            R.drawable.ic_split,
            resourceProvider.getColor( R.color.yellow)
        ),
        Item.Elements(
            "Утюжок",
            R.drawable.ic_curling_iron,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Title("Коммунальные услуги"),
        Item.Elements(
            "Свет",
            R.drawable.ic_light,
            resourceProvider.getColor( R.color.green_blue)
        ),
        Item.Elements(
            "Вода",
            R.drawable.ic_water,
            resourceProvider.getColor( R.color.green_blue)
        ),
        Item.Elements(
            "Газ",
            R.drawable.ic_gas,
            resourceProvider.getColor( R.color.green_blue)
        ),
        Item.Title("На выходе"),
        Item.Elements(
            "Окна",
            R.drawable.ic_window,
            resourceProvider.getColor( R.color.blue)
        ),
        Item.Elements(
            "Дверь",
            R.drawable.ic_door,
            resourceProvider.getColor( R.color.blue)
        ),
        Item.Elements(
            "Сигнализация",
            R.drawable.ic_alarm,
            resourceProvider.getColor( R.color.blue)
        )
    )
}