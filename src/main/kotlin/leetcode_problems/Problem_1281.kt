package leetcode_problems

fun main() {
    println(subtractProductAndSum(10225))
}

fun subtractProductAndSum(number: Int): Int {
    var sum = 0
    var product = 1
    var num = number

    while (num > 0) {
        val remainder = num % 10
        sum += remainder
        product *= remainder
        num /= 10
    }

    return product - sum
}