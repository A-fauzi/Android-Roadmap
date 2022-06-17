package inheritance

/**
 * Is parent class
 */
open class Club {
    open fun clubName(){

    }
}

/**
 * Is child class from class Club
 */
class Juventus: Club() {
    override fun clubName() {
        // super.clubName()
        println("Juventus")
    }
}

/**
 * Is child class from class Club
 */
class Barcelona: Club() {
    override fun clubName() {
        // super.clubName()
        println("Barcelona")
    }
}
