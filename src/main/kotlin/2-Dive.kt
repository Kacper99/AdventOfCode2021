import java.io.File

fun main() {
    part1()
    part2()
}

fun part1() {
    var pos = 0
    var depth = 0
    File("src/main/resources/input2.txt").forEachLine {
        val (action, amount) = it.split(" ")
        when (action) {
            "forward" -> pos += amount.toInt()
            "up" -> depth -= amount.toInt()
            "down" -> depth += amount.toInt()
        }
    }
    println(pos * depth)
}

fun part2() {
    var pos = 0
    var depth = 0
    var aim = 0
    File("src/main/resources/input2.txt").forEachLine {
        val (action, amount) = it.split(" ")
        when (action) {
            "forward" -> {
                pos += amount.toInt()
                depth += amount.toInt() * aim
            }
            "up" -> aim -= amount.toInt()
            "down" -> aim += amount.toInt()
        }
    }
    println(pos * depth)
}