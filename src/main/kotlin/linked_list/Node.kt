package linked_list

data class Node<T>(val value: T, var next: Node<T>? = null) {

    override fun toString(): String {
        return if (next != null) {
            "$value -> $next"
        } else {
            "$value"
        }
    }
}

fun main() {
    "creating and linking nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }
}

infix fun String.example(onAction: () -> Unit) {
    println("---Example of $this---")
    onAction()
}
