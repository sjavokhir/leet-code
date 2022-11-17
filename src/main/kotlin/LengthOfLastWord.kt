fun main() {
    println(lengthOfLastWord("Hello world"))
    println(lengthOfLastWord("Hello world 2 "))
    println(lengthOfLastWord(" Hello world 3 "))
}

private fun lengthOfLastWord(s: String): Int {
    return s.trim().let { it.lastIndex - it.lastIndexOf(' ') }
}