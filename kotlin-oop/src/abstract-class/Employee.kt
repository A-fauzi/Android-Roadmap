package `abstract-class`

/**
 * abstract class Employee is parent
 */
abstract class Employee(val name: String, val experience: Int) {

    /**
     * Abstract property (Must be overridden by Subclass)
     */
    abstract var salary: Double

    /**
     * Abstract methods (Must be implemented by Subclass)
     */
    abstract fun dateOfBirth(date: String)

    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}

/**
 * Derived class
 */
class Engineer(name: String, experience: Int): Employee(name, experience){
    override var salary = 500000.00
    override fun dateOfBirth(date: String) {
        println("Date of birth is $date")
    }
}