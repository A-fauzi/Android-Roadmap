package collection.arrays

fun main() {
    val cardNames = arrayOf("Jack", "Queen", "King")
    cardNames[0] = "Ace" // Set array in first index
    val firstCard = cardNames[0] // firstCard = "Jack"
    println(firstCard)
}