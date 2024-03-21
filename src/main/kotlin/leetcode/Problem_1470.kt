package leetcode

import util.print

fun main() {
    "1470. Shuffle the Array" print {
        println(shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).joinToString()) // [2,3,5,4,1,7]
        println(shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4).joinToString()) // [1,4,2,3,3,2,4,1]
        println(shuffle(intArrayOf(1, 1, 2, 2), 2).joinToString()) // [1,2,1,2]
    }
}

// x1, x2, x3, x4, x5,  y1, y2, y3, y4, y5

// x1, y1, x2, y2, x3,  y3, x4, y4, x5, y5

// x2, x3, x4, x5,  y1, y2, y3, y4
// y1, x2, y2, x3,  y3, x4, y4, x5

fun shuffle(nums: IntArray, n: Int): IntArray {
    val ans = IntArray(nums.size)
    var size = 0

    for (i in 0..<n) {
        ans[size] = nums[i]
        size++

        ans[size] = nums[i + n]
        size++
    }

    return ans
}
