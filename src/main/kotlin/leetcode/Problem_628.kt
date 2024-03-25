package leetcode

import util.print

fun main() {
    "628. Maximum Product of Three Numbers" print {
        println(maximumProduct(intArrayOf(1, 2, 3)))
        println(maximumProduct(intArrayOf(-100, -99, 2, 3, 4)))
    }
}

fun maximumProduct(nums: IntArray): Int {
    // Initialize the three largest and two smallest numbers
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    var max3 = Int.MIN_VALUE
    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE

    // Iterate through the array to update the values
    for (num in nums) {
        // Update the three largest numbers
        when {
            num >= max1 -> {
                max3 = max2
                max2 = max1
                max1 = num
            }

            num >= max2 -> {
                max3 = max2
                max2 = num
            }

            num > max3 -> max3 = num
        }

        // Update the two smallest numbers
        when {
            num <= min1 -> {
                min2 = min1
                min1 = num
            }

            num < min2 -> min2 = num
        }
    }

    // Return the maximum of the product of three largest numbers
    // or the product of the largest number and two smallest numbers
    return maxOf(max1 * max2 * max3, max1 * min1 * min2)
}