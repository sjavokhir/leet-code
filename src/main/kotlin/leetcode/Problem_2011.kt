package leetcode

import util.print

fun main() {
    "2011. Final Value of Variable After Performing Operations" print {
        println(finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
        println(finalValueAfterOperations(arrayOf("++X", "++X", "X++")))
    }
}

fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0

    operations.forEach { operator ->
        when (operator[0]) {
            '-' -> --x
            '+' -> ++x
        }

        when (operator[operator.length - 1]) {
            '-' -> x--
            '+' -> x++
        }
    }

    return x
}