package leetcode

fun main() {
    println(findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
    println(findDisappearedNumbers(intArrayOf(1, 1)))
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val answer = mutableListOf<Int>()
    val set = nums.toHashSet()

    for (num in 1..nums.size) {
        if (!set.contains(num)) {
            answer.add(num)
        }
    }

    return answer
}