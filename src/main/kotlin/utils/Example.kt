package utils

infix fun String.print(onAction: () -> Unit) {
    println("---Example of $this---")
    onAction()
    println()
}