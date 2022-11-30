package math// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

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