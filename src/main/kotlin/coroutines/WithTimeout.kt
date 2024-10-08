package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
        val job = withTimeoutOrNull(1_500) {
            repeat(1_000) {
                println("job: I'm sleeping $it ...")
                delay(400)
            }
        }
        println(job)
    }
}