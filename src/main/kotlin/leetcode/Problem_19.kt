package leetcode

import util.print

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = null

    "19. Remove Nth Node From End of List" print {
        println(removeNthFromEnd(node1, 2))
    }
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    // Create a dummy node to handle edge cases where the head needs to be removed
    val dummy = ListNode(0)
    dummy.next = head

    var first: ListNode? = dummy
    var second: ListNode? = dummy

    // Move the second pointer ahead by n+1 steps
    for (i in 1..n + 1) {
        second = second?.next
    }

    // Move both pointers until the second pointer reaches the end
    while (second != null) {
        first = first?.next
        second = second.next
    }

    // Now the first pointer is at the node just before the one to be removed
    first?.next = first?.next?.next

    return dummy.next
}

private fun getCount(head: ListNode?): Int {
    var current = head
    var count = 0

    while (current != null) {
        current = current.next
        count++
    }

    return count
}