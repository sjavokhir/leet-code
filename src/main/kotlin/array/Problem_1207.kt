package array

fun main() {
    println(uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)))
    println(uniqueOccurrences(intArrayOf(1, 2)))
    println(uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)))
}

fun uniqueOccurrences(arr: IntArray): Boolean {
    val freq = hashMapOf<Int, Int>()
    arr.forEach {
        freq[it] = freq.getOrDefault(it, 0) + 1
    }
    val freqSet = HashSet(freq.values)
    return freq.size == freqSet.size
}