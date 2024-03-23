package leetcode

import util.print

fun main() {
    "206. Reverse Linked List" print {}
}

fun reverseList(head: ListNode?): ListNode? {
    var prevNode: ListNode? = null
    var nextNode: ListNode?
    var currentNode = head

    while (currentNode != null) {
        nextNode = currentNode.next
        currentNode.next = prevNode
        prevNode = currentNode
        currentNode = nextNode
    }

    return prevNode
}