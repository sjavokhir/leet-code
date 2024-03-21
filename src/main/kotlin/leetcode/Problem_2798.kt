package leetcode

import util.print

fun main() {
    "2798. Number of Employees Who Met the Target" print {
        println(numberOfEmployeesWhoMetTarget(intArrayOf(0, 1, 2, 3, 4), 2))
        println(numberOfEmployeesWhoMetTarget(intArrayOf(5, 1, 4, 2, 2), 6))
    }
}

fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
    return hours.count { hour -> hour >= target }
}