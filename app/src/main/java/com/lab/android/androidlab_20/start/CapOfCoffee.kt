package com.lab.android.androidlab_20.start

import java.util.*

const val americano = "Americano"
const val latte = "Latte"

class CapOfCoffee {
    private val dayOfTheWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val coffeeOfTheDay = when (dayOfTheWeek) {
        Calendar.MONDAY -> americano
        else -> latte
    }

}
