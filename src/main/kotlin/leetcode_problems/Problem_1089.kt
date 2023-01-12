package leetcode_problems

fun main() {
    duplicateZeros(intArrayOf(1, 0, 2, 3, 0, 4, 5, 0))
    duplicateZeros(intArrayOf(1, 2, 3))
}

fun duplicateZeros(arr: IntArray) {
    val countZero = arr.count { it == 0 }

    var i = arr.size - 1
    var j = arr.size + countZero - 1

    while (i < j) {
        if (arr[i] != 0) {
            if (j < arr.size) arr[j] = arr[i]
        } else {
            if (j < arr.size) arr[j] = arr[i]
            j--
            if (j < arr.size) arr[j] = arr[i]
        }
        i--
        j--
    }
}