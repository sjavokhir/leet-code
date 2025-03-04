package util

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
//    val uzLines = getResourceAsText("text_uz.txt")?.split("\n\n").orEmpty()
//    val cyrLines = getResourceAsText("text.txt")?.split("\n\n").orEmpty()
//
//    uzLines.forEachIndexed { index, uz ->
//        val content = """
//                {
//                    "_id": ${index + 1},
//                    "uz": "$uz",
//                    "uz_cyr": "${cyrLines[index]}",
//                },
//            """.trimIndent()
//
//        println(content)
//    }
//
//    val arabic = getResourceAsText("hafs.json").orEmpty()
//    val arabicMap: Map<String, Arabic> = json.decodeFromString(arabic)
//
//    val transUz = getResourceAsText("translation_uz.json").orEmpty()
//    val transUzMap: Map<String, Translation> = json.decodeFromString(transUz)
//
//    val transUzCyr = getResourceAsText("translation_uz_cyr.json").orEmpty()
//    val transUzCyrMap: Map<String, Translation> = json.decodeFromString(transUzCyr)
//
//    val transEnCyr = getResourceAsText("translation_en.json").orEmpty()
//    val transEnMap: Map<String, Translation> = json.decodeFromString(transEnCyr)
//
//    val transRuCyr = getResourceAsText("translation_ru.json").orEmpty()
//    val transRuMap: Map<String, Translation> = json.decodeFromString(transRuCyr)
//
//    val translitEn = getResourceAsText("translit.en.csv").orEmpty().split("\n")
//    val translitRu = getResourceAsText("translit.ru.csv").orEmpty().split("\n")

//    val json = Json { ignoreUnknownKeys = true }
//
//    val duaItemsJson = getResourceAsText("dua.json").orEmpty()
//    val duasItems: List<DuaRequest> = json.decodeFromString(duaItemsJson)
//
//    duasItems.forEachIndexed { index, dua ->
//        val jsonString = json.encodeToString(
//            dua.copy(
//                id = 319 + index,
//                categoryId = 13,
//                chapterId = 184 + index
//            )
//        )
//
//        println("$jsonString,")
//    }
}

fun getResourceAsText(path: String): String? =
    { }::class.java.classLoader.getResource(path)?.readText()