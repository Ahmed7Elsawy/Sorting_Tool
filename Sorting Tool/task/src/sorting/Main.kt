package sorting

import java.util.*

fun main() {
    val list: MutableList<Int> = mutableListOf()
    val scan = Scanner(System.`in`)
    while (scan.hasNext()) {
        val line = scan.nextLine().split("\\s+|\\n".toRegex())
        for (number in line) {
            list.add(number.toInt())
        }
    }
    println("Total numbers: ${list.count()}.")
    println("The greatest number: ${list.maxOrNull()} (${list.count { it == list.maxOrNull() }} time(s)).")
}