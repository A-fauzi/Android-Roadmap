package collection.lists

fun main() {
    val cards = mutableListOf("Jack", "Queen", "King")
    cards.add("Ace") // add element in list
    cards.remove("Jack") // Remove element
    cards.removeAt(0) // Remove element by index
    cards.clear() // remove all element or empty list
    cards.addAll(arrayOf("Jack", "Queen", "King", "Ace"))
    println(cards)
}