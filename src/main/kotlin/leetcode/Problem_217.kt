package leetcode

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
    println(containsDuplicate2(intArrayOf(1, 2, 3, 4)))
    println(containsDuplicate2(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>()
    nums.forEach {
        if (!hashSet.add(it)) return true
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    return nums.size > nums.toSet().size
}