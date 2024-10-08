package coroutines

import kotlinx.coroutines.*

/*
* When I add a delay in the loop, the loop get's cancelled before completing because
* delay is a suspend function and as I mentioned above all suspend functions are cancellable.
*/

fun main() {
    cancelCoroutineWithIsActive()
}

private fun cancelCoroutine() {
    runBlocking {
        val job = launch {
            try {
                repeat(1_000) {
                    println("job: Working $it ...")
                    delay(500)
                }
            } catch (cause: CancellationException) {
                println(cause.message)
            } finally {
                println("Finished")
            }
        }

        delay(2_500)

        println("I'm tired of waiting!")

        job.cancelAndJoin()

        println("Now I can quit.")
    }
}

private fun nonCancellableCoroutine() = runBlocking {
    var sum = 0
    val job = launch {
        repeat(1_000) {
            sum += it
            println("Partial sum after $it iterations: $sum")
        }
    }

    delay(500)

    println("I'm tired of waiting!")

    job.cancelAndJoin()

    println("Now I can quit.")
}

private fun cancelCoroutineWithYield() = runBlocking {
    var sum = 0
    val job = launch {
        repeat(1_000) {
            yield()
            sum += it
            println("Partial sum after $it iterations: $sum")
        }
    }

    delay(100)

    println("I'm tired of waiting!")

    job.cancelAndJoin()

    println("Now I can quit.")
}

private fun cancelCoroutineWithIsActive() = runBlocking {
    var sum = 0
    val job = launch {
        repeat(1_000) {
            if (isActive) {
                sum += it
                println("Partial sum after $it iterations: $sum")
            }
        }
    }

    println("I'm tired of waiting!")

    job.cancelAndJoin()

    println("Now I can quit.")
}