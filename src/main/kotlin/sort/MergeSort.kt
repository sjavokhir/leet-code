package sort

/*
Ikki arrayda tartiblangan sonlar keltirilgan. Ularni tartiblangan ko'rinishda merge qiling.
Misol uchun. [1,2,4,7] va [3,5,8,9]

Bu misolda maximal bo'lishi mumkin

n = arr1.size, m = arr2.size

O(n+m) - Xotira. Chunki natijani arrayga saqlash kerak
O(n+m) - Vaqt. Chunki n+m marta loop bo'lishi kerak
 */

fun main() {
    println(mergeSort(intArrayOf(1, 2, 4, 7), intArrayOf(3, 5, 8, 9)))
}

fun mergeSort(arr1: IntArray, arr2: IntArray): Double {
    val n = arr1.size
    val m = arr2.size
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

    return if (result.size % 2 == 0) {
        (result[result.size / 2] + result[(result.size / 2) - 1]).toDouble() / 2
    } else {
        result[result.lastIndex / 2].toDouble()
    }
}