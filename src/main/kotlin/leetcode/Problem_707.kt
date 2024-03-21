package leetcode

import util.print

fun main() {
    "707. Design Linked List" print {
        val obj = MyLinkedList()
        obj.addAtHead(1)
        obj.deleteAtIndex(1)
        obj.deleteAtIndex(1)
        obj.addAtTail(7)
        obj.deleteAtIndex(2)
        obj.addAtTail(1)
        obj.addAtTail(8)
        obj.addAtHead(2)
        obj.addAtIndex(5, 2)
        obj.addAtTail(7)
        obj.addAtTail(7)

        println(obj)
        println(obj.get(2))
    }
}

data class Node(val value: Int, var next: Node? = null) {

    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class MyLinkedList {

    private var head: Node? = null
    private var size = 0

    private fun isEmpty(): Boolean {
        return size == 0
    }

    fun get(index: Int): Int {
        var cur = head
        for (i in 0 until index) cur = cur?.next
        return cur?.value ?: -1
    }

    fun addAtHead(value: Int) {
        head = Node(value, head)
        size++
    }

    fun addAtTail(value: Int) {
        if (isEmpty()) {
            addAtHead(value)
            return
        }

        var cur = head
        while (cur?.next != null) {
            cur = cur.next
        }
        cur?.next = Node(value)
        size++
    }

    fun addAtIndex(index: Int, value: Int) {
        if (index == 0) {
            addAtHead(value)
        } else {
            var cur = head
            for (i in 0 until index - 1) cur = cur?.next
            cur?.next = Node(value, cur?.next)
            size++
        }
    }

    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= size) return

        if (index == 0) {
            head = head?.next
            size--
            return
        }

        var cur = head
        for (i in 0 until index - 1) cur = cur?.next
        cur?.next = cur?.next?.next
        size--
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }
}
