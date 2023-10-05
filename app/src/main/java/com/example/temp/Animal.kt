package com.example.temp

interface MakeSound {
    fun loudVoice(): String
    fun quietVoice(): String
}

// Animal class with properties name and species
open class Animal(val name: String, val species: String) : MakeSound {
    open fun move() {
        println("$name is moving")
    }

    override fun loudVoice(): String {
        return "$name makes a loud voice"
    }

    override fun quietVoice(): String {
        return "$name makes a quiet voice"
    }
}

// Dog class extending Animal and implementing MakeSound interface
open class Dog(name: String) : Animal(name, "Dog") {
    override fun move() {
        println("$name is running")
    }
}

// Bird class extending Animal and implementing MakeSound interface
open class Bird(name: String) : Animal(name, "Bird") {
    override fun move() {
        println("$name is flying")
    }
}

// Fish class extending Animal without implementing MakeSound interface
open class Fish(name: String) : Animal(name, "Fish"){
    override fun move() {
        println("$name is swimming")
    }
}

// Example usage of classes and interfaces
