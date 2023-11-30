package about

/*
    Data classes were created as a data holder.

    1. `toString()`, `equals()` and `hashCode()` are implemented for you;
    2. destructuring;
    3. ease of copying by calling the `copy()` method.

    Restrictions

    - allow to inherit data classes from interfaces
    - forbid to inherit data classes from other classes
    - forbid `open` data classes (i.e. other classes can not extend data classes)
    - forbid `inner` data classes (not clear how `equals()/hashCode()` should treat the outer reference)
    - allow local data classes (the closure is not structured, so it’s OK for `equals()/hashCode()` to ignore it)
    - require `val/var` on all primary constructor parameters for data classes
    - require at least one primary constructor parameter for data classes
    - allow private primary constructor parameters for data classes
    - `vararg` is not allowed due to how equals() works on the JVM for arrays and collections.

    Collections are compared structurally, while arrays are not, `equals()`
    for them simply resorts to referential equality: `this === other`.
 */

private data class Puppy(
    val name: String,
    val breed: String
)

private fun use() {
    val tofuPuppy = Puppy(name = "Tofu", breed = "Corgi")

    // destructuring
    val (name, breed) = tofuPuppy
    println(name) // prints: "Tofu"

    // copy: create a puppy with the same breed and cuteness as tofuPuppy but with a different name
    val tacoPuppy = tofuPuppy.copy(name = "Taco")
}

private class User {
    var name: String  // Backing field generated
        get() = name
        set(value) {
            name = value
        }

    var lastname: String   // Backing field generated
        get() = lastname
        set(value) {
            lastname = value
        }

    /*
        So when set(value) {firstName = "value"} is called, then a recursive call happens and
        compiler throws a StackOverflow exception because we are calling setter inside the setter.

        Solution to this problem is to user backing fields. In Kotlin a backing field can be
        accessed using field keyword inside accessors. Take a look at corrected code snippet below.
     */

    var fieldName: String = ""
        get() = field
        set(value) {
            field = value + "1"
        }

    var fieldLastname: String = ""
        get() = field
        set(value) {
            field = value + "2"
        }
}

/*
    Difference between `equals()` and `hashCode()`

    Java equals()

    - The java equals() is a method of lang.Object class, and it is used to compare two objects.
    - To compare two objects that whether they are the same, it compares the values of both the object's attributes.
    - By default, two objects will be the same only if stored in the same memory location.

    Java hashcode()

    - A hashcode is an integer value associated with every object in Java, facilitating the hashing in hash tables.
    - The hashcode() method returns the same hash value when called on two objects, which are equal
      according to the equals() method. And if the objects are unequal, it usually returns different hash values.
 */