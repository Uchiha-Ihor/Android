package com.example.temp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    fun Gavna(){
        val dog = Dog("Buddy")
        val bird = Bird("Robin")
        val fish = Fish("Nemo")

        dog.move()
        println(dog.loudVoice())

        bird.move()
        println(bird.quietVoice())

        fish.move()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Gavna()
    }
}