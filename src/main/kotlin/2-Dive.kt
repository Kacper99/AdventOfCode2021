import java.io.File

fun main() {
    var pos = 0
    var depth = 0
    File("src/main/resources/input2.txt").forEachLine {
        var (action, amount) = it.split(" ")
        when (action) {
            "forward" -> pos += amount.toInt()
            "up" -> depth -= amount.toInt()
            "down" -> depth += amount.toInt()
        }
    }
    println(pos * depth)
}