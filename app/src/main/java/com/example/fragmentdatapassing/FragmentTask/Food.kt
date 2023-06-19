package com.example.fragmentdatapassing.FragmentTask

data class Food(val foodName: String) {

    companion object {
        val food = arrayListOf<Food>(Food("Mango"),Food("Jackfruit"),
            Food("Banana"),Food("Grape"),Food("Apple"),
            Food("Pomegranate"),Food("Papaya"),Food("Orange"),
            Food("Pineapple"),Food("Mango"),Food("Mango"))
    }

}