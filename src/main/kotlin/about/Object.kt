package about

/*
    There are times we need to use a companion object to define class members that are going to be used
    independently of any instance of that class. The Kotlin compiler guarantees we will have one and only
    one instance of a companion object. For those of us with a background in Java and C#,
    a companion object is similar to static declarations.

    We can have only one companion object per class.

    The main difference between Java's static keyword and Kotlin's companion object is
    that the latter is more powerful and flexible, and provides a way to define class-level functionality
    that can be accessed using the class name, with or without the Companion suffix,
    and can also implement interfaces and have extension functions.
 */

private class ClassName {

    companion object {
        const val propertyName: String = "Something..."

        fun funName() {
            //...
        }
    }
}

private fun use() {
    // Now, properties and functions defined within the companion object body
    // are accessible by referring to the class name:

    val property = ClassName.propertyName
    ClassName.funName()
}