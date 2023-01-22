package leetcode_problems

import utils.print

fun main() {
    "Pascal's Triangle solution 1" print {
        println(solution1(5))
    }
    "Pascal's Triangle solution 2" print {
        println(solution2(5))
    }
}

private fun solution1(numRows: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    ans.add(listOf(1))
    for (i in 1 until numRows) {
        val prev = ans[ans.lastIndex]
        val curr = ArrayList<Int>(prev.size + 1)
        curr.add(1)
        for (j in 0 until prev.lastIndex) {
            curr.add(prev[j] + prev[j + 1])
        }
        curr.add(1)
        ans.add(curr)
    }
    return ans
}

private fun solution2(numRows: Int): List<List<Int>> {
    val result = ArrayList<List<Int>>()
    val row = ArrayList<Int>()
    for (i in 0 until numRows) {
        row.add(0, 1)
        for (j in 1 until row.size - 1) {
            row[j] = row[j] + row[j + 1]
        }
        result.add(ArrayList<Int>(row))
    }
    return result
}