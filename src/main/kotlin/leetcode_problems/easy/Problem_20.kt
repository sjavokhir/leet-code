package leetcode_problems.easy

import utils.print
import java.util.*

fun main() {
    "Valid Parentheses solution" print {
        println(solution("([{[()]}])"))
    }
}

private fun solution(s: String): Boolean {
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