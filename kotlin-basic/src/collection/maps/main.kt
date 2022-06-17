package collection.maps

fun main() {
    val cards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)

    val jackValue = cards["Jack"] // get value from key, result 11
    println("$jackValue\n")

    val cards1 = mutableMapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    cards1["Ace"] = 1
    println("$cards1\n")

    val cards2 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    val mutableCards = cards2.toMutableMap()
    mutableCards["Ace"] = 1
    println(mutableCards)
}