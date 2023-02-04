package leetcode_problems.medium

import utils.print

fun main() {
    "167. Two Sum II - Input Array Is Sorted solution 1" print {
        println(solution1(numbers = intArrayOf(2, 7, 11, 15), target = 9).toList())
        println(solution1(numbers = intArrayOf(2, 3, 4), target = 6).toList())
        println(solution1(numbers = intArrayOf(-1, 0), target = -1).toList())
    }

    "167. Two Sum II - Input Array Is Sorted solution 2" print {
        println(solution2(numbers = intArrayOf(2, 7, 11, 15), target = 9).toList())
        println(solution2(numbers = intArrayOf(2, 3, 4), target = 6).toList())
        println(solution2(numbers = intArrayOf(-1, 0), target = -1).toList())
    }
}

private fun solution1(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        for (j in (i + 1)..numbers.lastIndex) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i + 1, j + 1)
            }
        }
    }
    return intArrayOf()
}

private fun solution2(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex

    while (left != right) {
        val tmp = numbers[right] + numbers[left]
        if (tmp == target) return intArrayOf(left + 1, right + 1)
        if (tmp > target) {
            right--
        } else {
            left++
        }
    }

    return intArrayOf()
}