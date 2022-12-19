package leetcode_problems

fun main() {
    println(isHappy(7))
}

fun isHappy(n: Int): Boolean {
    val set = HashSet<Int>()
    var result = n

    while (result != 1) {
        if (!set.contains(result)) {
            set.add(result)
        } else return false

        result = getSum(result)
    }

    return true
}

private fun getSum(num: Int): Int {
    var result = num
    var sum = 0

    while (result != 0) {
        val remainder = result % 10
        sum += (remainder * remainder)
        result /= 10
    }

    return sum
}