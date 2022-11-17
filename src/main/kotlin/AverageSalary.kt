// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

fun main() {
    val salary = intArrayOf(
        48000,
        59000,
        99000,
        13000,
        78000,
        45000,
        31000,
        17000,
        39000,
        37000,
        93000,
        77000,
        33000,
        28000,
        4000,
        54000,
        67000,
        6000,
        1000,
        11000
    )
    print(average(salary))
}

fun average(salary: IntArray): Double {
    var sum = salary[0]
    var min = sum
    var max = sum

    for (i in 1..salary.lastIndex) {
        val number = salary[i]

        if (min > number) {
            min = number
        } else if (max < number) {
            max = number
        }

        sum += number
    }

    return (sum.toDouble() - max - min) / (salary.size - 2)
}
