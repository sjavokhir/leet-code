package array// https://leetcode.com/problems/two-sum/

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    twoSum(nums, target).forEach {
        println(it)
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val complements = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        val requiredNum = target - num
        if (complements.containsKey(requiredNum)) {
            return intArrayOf(complements[requiredNum]!!, index)
        }
        complements[num] = index
    }
    return intArrayOf()
}