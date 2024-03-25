package leetcode

import util.print

fun main() {
    "876. Middle of the Linked List" print {}
}

fun middleNode(head: ListNode?): ListNode? {
    var count = 0
    var currentNode = head

    while (currentNode != null) {
        currentNode = currentNode.next
        count++
    }

    var middleNode = head
    repeat(count / 2) {
        middleNode = middleNode?.next
    }

    return middleNode
}

fun middleNode2(head: ListNode?): ListNode? {
    var fast: ListNode? = head
    var slow: ListNode? = head

    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
    }

    return slow
}