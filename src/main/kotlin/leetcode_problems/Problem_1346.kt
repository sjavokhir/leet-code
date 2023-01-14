package leetcode_problems

fun main() {
    println(checkIfExist(intArrayOf(10, 2, 5, 3)))
    println(checkIfExist(intArrayOf(3, 1, 7, 11)))
    println(checkIfExist(intArrayOf(7, 1, 14, 11)))
    println(checkIfExist(intArrayOf(4, -7, 11, 4, 18)))
    println(checkIfExist(intArrayOf(-20, 8, -6, -14, 0, -19, 14, 4)))
}

fun checkIfExist(arr: IntArray): Boolean {
    val map = HashMap<Int, Int>()

    for (i in 0..arr.lastIndex) {
        if (map.containsKey(arr[i] * 2)) return true
        if (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2) ) return true
        map[arr[i]] = i
    }

    return false
}