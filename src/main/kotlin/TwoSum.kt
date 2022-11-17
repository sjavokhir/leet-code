// https://leetcode.com/problems/two-sum/

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    println(twoSum(nums, target).size)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = HashMap<Int, Int>()

    nums.forEachIndexed { index, number ->
        val requiredNum = target - number
        if (indexMap.containsKey(requiredNum)) {
            return intArrayOf(indexMap[requiredNum]!!, index)
        }
        indexMap[number] = index
    }

    return intArrayOf()
}