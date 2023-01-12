package leetcode_problems

fun main() {
    println(missingNumber3(intArrayOf(3, 0, 1)))
    println(missingNumber3(intArrayOf(0, 1)))
    println(missingNumber3(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun missingNumber(nums: IntArray): Int {
    var firstNumsSum = 0
    var secondNumsSum = 0

    nums.forEach {
        firstNumsSum += it
    }

    for (i in 0..nums.size) {
        secondNumsSum += i
    }

    return secondNumsSum - firstNumsSum
}

fun missingNumber2(nums: IntArray): Int {
    return (nums.size * (nums.size + 1)) / 2 - nums.sum()
}

fun missingNumber3(nums: IntArray): Int {
    var sum = 0
    nums.forEachIndexed { index, num ->
        sum += (index + 1) - num
    }
    return sum
}