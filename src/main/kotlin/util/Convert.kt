package util

fun main() {
    val uzLines = getResourceAsText("text_uz.txt")?.split("\n\n").orEmpty()
    val cyrLines = getResourceAsText("text.txt")?.split("\n\n").orEmpty()

    uzLines.forEachIndexed { index, uz ->
        val content = """
                {
                    "_id": ${index + 1},
                    "uz": "$uz",
                    "uz_cyr": "${cyrLines[index]}",
                },
            """.trimIndent()

        println(content)
    }
}

fun getResourceAsText(path: String): String? =
    object {}.javaClass.getResource(path)?.readText()