package main

import `class`.User
import `class`.UserWithConstructor
import `data-classes`.Person
import `object`.Animal

fun main() {
    val userGreetings = User() // Object 1 from class User
    userGreetings.greetings("Pokemon")

    val dataUser = UserWithConstructor("Nobita", 19) // Object 1 from class User with Controller
    dataUser.getDataUser()

    val person1 = Person("Doraemon", 24, "Eat dorayaki") // Object 1 from data class Person
    val person2 = person1.copy(name = "Conan", age = 20, hobbies = "Detective") // Object 2 from data class Person

    println("Name: ${person1.name} | Age: ${person1.age} | Hobbies: ${person1.hobbies}")
    println("Name: ${person2.name} | Age: ${person2.age} | Hobbies: ${person2.hobbies} \n")

    // Call singleton Object
    Animal.dataElephant()
    Animal.dataCat()
    Animal.dataDog()

}