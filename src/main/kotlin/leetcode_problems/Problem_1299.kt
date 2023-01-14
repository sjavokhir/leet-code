package leetcode_problems

fun main() {
    println(replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)).toList())
    println(replaceElements(intArrayOf(17, 18, 6, 4, 5, 1)).toList())
    println(replaceElements(intArrayOf(18, 18, 6, 4, 5, 1)).toList())
    println(replaceElements(intArrayOf(19, 18, 6, 4, 5, 1)).toList())
    println(replaceElements(intArrayOf(17, 1)).toList())
    println(replaceElements(intArrayOf(400)).toList())
}

fun replaceElements(arr: IntArray): IntArray {
    var max = -1

    for (i in arr.lastIndex downTo 0) {
        val temp = arr[i]
        arr[i] = max
        max = maxOf(temp, max)
    }

    return arr
}

fun replaceElements2(arr: IntArray): IntArray {
    if (arr.size == 1) {
        arr[0] = -1
        return arr
    }

    var max = getMax(arr, 1)

    for (i in 0..arr.lastIndex) {
        if (i < arr.lastIndex && arr[i] == max) {
            max = getMax(arr, i + 1)
            arr[i] = max
        } else if (i == arr.lastIndex) {
            arr[i] = -1
        } else {
            arr[i] = max
        }
    }

    return arr
}

fun getMax(arr: IntArray, index: Int): Int {
    var max = 0
    for (i in index..arr.lastIndex) {
        if (arr[i] > max) max = arr[i]
    }
    return max
}