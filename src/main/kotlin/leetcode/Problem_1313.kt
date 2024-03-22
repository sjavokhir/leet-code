package leetcode

import util.print

fun main() {
    "1313. Decompress Run-Length Encoded List" print {
        println(decompressRLElist(intArrayOf(1, 2, 3, 4)).joinToString())
        println(decompressRLElist(intArrayOf(1, 1, 2, 3)).joinToString())
        println(decompressRLElist(intArrayOf(55, 11, 70, 26, 62, 64)).joinToString())
    }
}

fun decompressRLElist1(nums: IntArray): IntArray {
    var capacity = 0
    var ans = IntArray(capacity)

    for (i in nums.indices step 2) {
        val freq = nums[2 * i]
        val value = nums[2 * i + 1]

        println("freq: $freq, value: $value")

        val newValues = IntArray(capacity + freq)

        for (idx in 0..<(capacity + freq)) {
            if (idx < capacity) {
                newValues[idx] = ans[idx]
            } else {
                newValues[idx] = value
            }
        }

        ans = newValues
        capacity += freq
    }

    return ans
}

fun decompressRLElist(nums: IntArray): IntArray {
    val result = mutableListOf<Int>()

    for (i in nums.indices step 2)
        for (j in 0 until nums[i])
            result.add(nums[i + 1])

    return result.toIntArray()
}
