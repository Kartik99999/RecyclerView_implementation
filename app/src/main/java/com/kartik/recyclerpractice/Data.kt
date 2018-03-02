package com.kartik.recyclerpractice

/**
 * Created by Kartik Sethi on 03-03-2018.
 */
object Data {
    val texts = mutableListOf<String>()
    val images = mutableListOf<Int>()

    init {
        for (i in 0..49) {
            texts.add("It is element ${i + 1}")
            var oneToFive = i % 5
             val image= when (oneToFive) {
                0 -> R.drawable.abc
                1 -> R.drawable.def
                2 -> R.drawable.ghi
                3 -> R.drawable.jkl
                4 -> R.drawable.mno
                else
                -> R.drawable.abc
            }
            images.add(i,image)
        }
    }
}