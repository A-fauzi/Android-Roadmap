package control_flow.looping

fun main() {
    val cards = mutableListOf("Jack", "Queen", "King")
    for(i in cards) {
        println("$i \n")
    }

    // Loop in range number
    for (i in 1..100) {
        println("$i \n")
    }

    for (i in 10 downTo 1) {
        println("$i \n")
    }

    // Looping with map
    val cardsMap = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for ((name, value) in cardsMap) {
        println("$name: $value")
    }

    var stillDownloading = 0
    while (stillDownloading < 10) {
        stillDownloading++
        println(stillDownloading)
    }
}