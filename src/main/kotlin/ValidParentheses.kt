import java.util.Stack

// https://leetcode.com/problems/valid-parentheses/

fun main() {
    val s = "([{[()]}])"
    println(isValid(s))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    s.forEach { element ->
        if (element == '(' || element == '[' || element == '{') {
            stack.push(element)
            return@forEach
        } else if (stack.empty()) {
            return false
        }

        val top = stack.pop()
        if (top == '(' && element != ')') {
            return false
        } else if (top == '[' && element != ']') {
            return false
        } else if (top == '{' && element != '}') {
            return false
        }
    }

    return stack.empty()
}