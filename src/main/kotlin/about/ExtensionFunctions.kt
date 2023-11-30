package about

/*
    While Kotlin extension functions might look magical, they are really simple under the hood.
    A top-level extension function is compiled to a static function with a receiver object on the first argument.
    Let's look at the already presented toast function:

    fun Context.toast(text: String) {
        Toast.makeText(this, text, LENGTH_LONG).show()
    }

    This function, after compilation and decompilation to Java, will look similar to the following function:

    // Java
    public class ContextExtKt {
        public static void toast(Context receiver, String text) {
            Toast.makeText(receiver, text, Toast.LENGTH_SHORT).show();
        }
    }

    Kotlin top-level extension functions are compiled to static functions with a receiver object on ...
 */

private class ExtensionFunctions {

    private var num = 12

    fun String.test() {
        num += 10

        println(num)
    }
}

private fun String.test2() {
}

private fun use() {
    "Hello".test2()
//    "Hello".test() Cannot call
}