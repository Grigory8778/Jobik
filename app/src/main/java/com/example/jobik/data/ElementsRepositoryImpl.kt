package com.example.jobik.data


import com.example.jobik.R
import com.example.jobik.presentation.base.Item

class ElementsRepositoryImpl(
    private val resourceProvider: ResourceProvider
) : ElementsRepository {
    override fun getElementsAll(): List<Item> = listOf(
        Item.Title(R.string.electrical),
        Item.Elements(
            resourceProvider.getString(R.string.iron),
            R.drawable.ic_iron,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.computer),
            R.drawable.ic_pc,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.split),
            R.drawable.ic_split,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.rectifier),
            R.drawable.ic_curling_iron,
            resourceProvider.getColor(R.color.yellow)
        ),
        Item.Title(R.string.utilities),
        Item.Elements(
            resourceProvider.getString(R.string.light),
            R.drawable.ic_light,
            resourceProvider.getColor(R.color.green_blue)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.water),
            R.drawable.ic_water,
            resourceProvider.getColor(R.color.green_blue)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.gas),
            R.drawable.ic_gas,
            resourceProvider.getColor(R.color.green_blue)
        ),
        Item.Title(R.string.exit),
        Item.Elements(
            resourceProvider.getString(R.string.window),
            R.drawable.ic_window,
            resourceProvider.getColor(R.color.blue)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.door),
            R.drawable.ic_door,
            resourceProvider.getColor(R.color.blue)
        ),
        Item.Elements(
            resourceProvider.getString(R.string.signaling),
            R.drawable.ic_alarm,
            resourceProvider.getColor(R.color.blue)
        )
    )
}