package array// https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate

fun main() {
    println(
        nearestValidPoint(
            3, 4,
            arrayOf(
                intArrayOf(3, 4),
            )
        )
    )
}

fun nearestValidPoint(x1: Int, y1: Int, points: Array<IntArray>): Int {
    var lastIndex = -1
    var smallestDistance = Int.MAX_VALUE

    points.forEachIndexed { index, ints ->
        val x2 = ints[0]
        val y2 = ints[1]

        if (isValidPoint(x1, y1, x2, y2)) {
            val distance = distance(x1, y1, x2, y2)

            if (distance < smallestDistance) {
                lastIndex = index
                smallestDistance = distance
            }
        }
    }

    return lastIndex
}

private fun isValidPoint(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    return (x1 == x2) || (y1 == y2)
}

private fun distance(x1: Int, y1: Int, x2: Int, y2: Int): Int {
    return Math.abs(x1 - x2) + Math.abs(y1 - y2)
}