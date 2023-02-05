package leetcode_problems.easy

import utils.print

/*
    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

    Input: rowIndex = 3
    Output: [1,3,3,1]

    Input: rowIndex = 0
    Output: [1]

    Input: rowIndex = 1
    Output: [1,1]

    Solution:

    - We create a mutable list called result to store the current row of Pascal's triangle.
    - We use a nested loop to generate the nth row.
    - The outer loop i iterates from 0 to rowIndex, representing the current column of the current row.
    - The inner loop j iterates from i - 1 to 1, updating the current value of result[j] to the sum of result[j]
      and result[j - 1]. This way, the value of each column in the current row will be the sum of the two
      numbers directly above it in the previous row.
    - After the loop, we return the result list.
 */

fun main() {
    "119. Pascal's Triangle II solution" print {
        println(solution(1))
        println(solution(4))
        println(solution(3))
    }
}

private fun solution(rowIndex: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..rowIndex) {
        result.add(1)
        for (j in i - 1 downTo 1) {
            result[j] = result[j] + result[j - 1]
        }
    }
    return result
}