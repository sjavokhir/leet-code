package leetcode_problems

fun main() {
    println(generate(5))
    println(generate(1))
    println(generate(2))
}

fun generate(numRows: Int): List<List<Int>> {
    val result = ArrayList<List<Int>>()

    for (i in 0 until numRows) {
        val ans = ArrayList<Int>()

        for (j in 0..i) {
            if (j == 0 || j == i) {
                ans.add(1)
            } else {
                ans.add(j, result[i - 1][j - 1] + result[i - 1][j])
            }
        }

        result.add(ans)
    }

    return result
}