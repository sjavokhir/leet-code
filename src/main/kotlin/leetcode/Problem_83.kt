package leetcode

import util.print

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(1)
    val node3 = ListNode(2)
    val node4 = ListNode(3)
    val node5 = ListNode(3)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = null

    "83. Remove Duplicates from Sorted List" print {
        println(deleteDuplicates(node1))
    }
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var currentNode = head

    while (currentNode != null) {
        var nextNode = currentNode.next

        while (nextNode != null && currentNode.value == nextNode.value) {
            nextNode = nextNode.next
        }

        currentNode.next = nextNode
        currentNode = nextNode
    }

    return head
}