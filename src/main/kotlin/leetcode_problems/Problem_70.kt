package leetcode_problems

fun main() {
    println(climbStairs(1))
    println(climbStairs(2))
    println(climbStairs(3))
    println(climbStairs(4))
    println(climbStairs(5))
}

/*
        5               4              3            2           1
   -------------------------------------------------------------------
      2 2 1            2 2            2 1           2           1
      2 1 2           2 1 1           1 2          1 1
      1 2 2           1 2 1          1 1 1
     2 1 1 1          1 1 2
     1 2 1 1         1 1 1 1
     1 1 2 1
     1 1 1 2
    1 1 1 1 1
 */

fun climbStairs(n: Int): Int {
//    Bruce force aproach using recursion
//    Time: O(2^n), Space: O(n)
//    climbStairs1(0, n)

//    Using the idea of Fibonacci sequence
//    Time: O(n), Space: O(1)
//    countClimbStairs(n)

    return countClimbStairs(n)
}

private fun climbStairs(i: Int, n: Int): Int {
    if (i > n) return 0
    if (i == n) return 1
    return climbStairs(i + 1, n) + climbStairs(i + 2, n)
}

private fun countClimbStairs(n: Int): Int {
    if (n == 0 || n == 1)
        return n

    var firstFib = 1
    var secondFib = 2

    for (i in 3..n) {
        val nextFib = firstFib + secondFib
        firstFib = secondFib
        secondFib = nextFib
    }

    return secondFib
}