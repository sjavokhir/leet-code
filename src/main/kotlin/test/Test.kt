package test

fun main() {
    test()
}

fun test() {
    val array = IntArray(6)

    // Variable to keep track of the length of the array
    var length = 0

    // Iterate through the 6 indexes of the Array.
    for (i in 0..5) {
        // Add a new element and increment the length as well
        array[length++] = i
    }
}