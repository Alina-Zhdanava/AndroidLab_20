package com.lab.android.androidlab_20.start


class Order {

    private lateinit var coffee: CapOfCoffee

    constructor() {
        coffee = CapOfCoffee()
    }

    fun execute(): String = "[ORDER] Your ${coffee.coffeeOfTheDay} is ready !"
}