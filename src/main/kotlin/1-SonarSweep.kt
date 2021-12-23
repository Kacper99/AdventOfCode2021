import java.io.File

fun main(args: Array<String>) {
    val measurements = File("src/main/resources/input1.txt").readLines().map { it.toInt() }
    var increases = 0
    for (i in 1 until measurements.size) {
        if (measurements[i] > measurements[i - 1]) increases++
    }
    println(increases)
}