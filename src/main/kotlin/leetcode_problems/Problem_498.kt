package leetcode_problems

fun main() {
    println(
        findDiagonalOrder(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            )
        ).toList()
    )

    println(
        findDiagonalOrder(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 4)
            )
        ).toList()
    )
}

fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    if (mat.isEmpty() || mat.first().isEmpty()) return intArrayOf()

    val m = mat.size
    val n = mat.first().size

    var row = 0
    var column = 0
    var diagonal = 0

    val ans = IntArray(m * n)
    val dirs = arrayOf(intArrayOf(-1, 1), intArrayOf(1, -1))

    for (i in 0 until m * n) {
        ans[i] = mat[row][column]
        row += dirs[diagonal][0]
        column += dirs[diagonal][1]

        if (row >= m) {
            row = m - 1
            column += 2
            diagonal = 1 - diagonal
        }

        if (column >= n) {
            column = n - 1
            row += 2
            diagonal = 1 - diagonal
        }

        if (row < 0) {
            row = 0
            diagonal = 1 - diagonal
        }

        if (column < 0) {
            column = 0
            diagonal = 1 - diagonal
        }
    }

    return ans
}