package sort

import java.util.LinkedList

/*
Ikki arrayda tartiblangan sonlar keltirilgan. Ularni tartiblangan ko'rinishda merge qiling.
Misol uchun. [1,2,4,7] va [3,5,8,9]

Bu misolda maximal bo'lishi mumkin

n = arr1.size, m = arr2.size

O(n+m) - Xotira. Chunki natijani arrayga saqlash kerak
O(n+m) - Vaqt. Chunki n+m marta loop bo'lishi kerak
 */

fun main() {
    mergeSort(mutableListOf(1, 2, 4, 7), mutableListOf(3, 5, 8, 9)).forEach {
        println(it)
    }
}

fun mergeSort(arr1: MutableList<Int>, arr2: MutableList<Int>): MutableList<Int> {
    val n = arr1.size
    val m = arr1.size
    var i = 0
    var j = 0
    val result = mutableListOf<Int>()

    while (i < n && j < m) {
        if (arr1[i] < arr2[j]) {
            result.add(arr1[i])
            i += 1
        } else {
            result.add(arr2[j])
            j += 1
        }
    }

    while (i < n) {
        result.add(arr1[i])
        i++
    }

    while (j < m) {
        result.add(arr2[j])
        j++
    }

    return result
}