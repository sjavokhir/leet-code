package leetcode

import util.print

/*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.

    There is a cycle in a linked list if there is some node in the list that can be reached
    again by continuously following the next pointer. Internally, pos is used to denote the
    index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

    Return true if there is a cycle in the linked list. Otherwise, return false.

    Solution:

    To determine if a linked list has a cycle, you can use the Floyd's cycle-finding algorithm,
    also known as the "Tortoise and Hare" algorithm. Here's how it works:

    1. Create two pointers, "slow" and "fast".
    2. Set both pointers to the head of the linked list.
    3. Move the slow pointer one step at a time and the fast pointer two steps at a time.
    4. If there is a cycle in the linked list, the fast pointer will eventually catch up to the
       slow pointer, and they will be pointing to the same node.
    5. If there is no cycle, the fast pointer will eventually reach the end of the linked list
       and the function can return false.
 */

fun main() {
    "141. Linked List Cycle solution" print {
        println(solution(ListNode(2)))
    }
}

private fun solution(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return true
    }
    return false
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}