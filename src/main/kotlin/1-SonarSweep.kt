import java.io.File

fun main(args: Array<String>) {
    val measurements = File("src/main/resources/input1.txt").readLines().map { it.toInt() }

    // Part 1
    var increases = 0
    for (i in 1 until measurements.size) {
        if (measurements[i] > measurements[i - 1]) increases++
    }
    println(increases)

    // Part 2
    increases = 0
    for (i in 4..measurements.size) {
        if (measurements.subList(i - 3, i).sum() > measurements.subList(i - 4, i - 1).sum()) increases++
    }
    println(increases)
}
