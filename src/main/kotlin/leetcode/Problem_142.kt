package leetcode

import util.print

/*
    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

    There is a cycle in a linked list if there is some node in the list that can be reached
    again by continuously following the next pointer. Internally, pos is used to denote the
    index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle.
    Note that pos is not passed as a parameter.

    Do not modify the linked list.

    Solution:

    The solution uses the Floyd's cycle-finding algorithm, also known as the "tortoise and the hare" algorithm.
    The idea is to use two pointers, a slow and a fast one, that move through the linked list.
    The slow pointer moves one step at a time, while the fast pointer moves two steps.
    If there is a cycle in the linked list, eventually the slow and fast pointers will meet at a certain node.

    Once the two pointers meet, we set the slow pointer back to the head of the linked list, and we move
    both pointers one step at a time until they meet again. The node where they meet is the node where the
    cycle begins. If there is no cycle, the fast pointer will eventually reach the end of the linked
    list and we will return null.
 */

fun main() {
    "Linked List Cycle II solution" print {
        println(solution(ListNode(2)))
    }
}

private fun solution(head: ListNode?): ListNode? {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) {
            slow = head
            while (slow != fast) {
                slow = slow?.next
                fast = fast?.next
            }
            return slow
        }
    }
    return null
}