package leetcode_problems

fun main() {

}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val m = matrix.size
    val n = matrix.first().size

    val result = mutableListOf<Int>()
    var rowStart = 0
    var rowEnd = m - 1
    var colStart = 0
    var colEnd = n - 1

    while (rowStart <= rowEnd && colStart <= colEnd) {
        for (i in colStart..colEnd) {
            result.add(matrix[rowStart][i])
        }

        rowStart += 1

        for (i in rowStart..rowEnd) {
            result.add(matrix[i][colEnd])
        }

        colEnd -= 1

        if (rowStart <= rowEnd) {
            for (i in colEnd downTo colStart) {
                result.add(matrix[rowEnd][i])
            }

            rowEnd -= 1
        }

        if (colStart <= colEnd) {
            for (i in rowEnd downTo rowStart) {
                result.add(matrix[i][colStart])
            }

            colStart += 1
        }
    }

    return result
}