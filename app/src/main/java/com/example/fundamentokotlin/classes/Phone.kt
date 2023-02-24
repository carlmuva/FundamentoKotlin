package com.example.fundamentokotlin.classes

open class Phone (protected var number: Long) {

    fun call(){
        println("LLamando")
    }

    open fun showNumber(){
        println("mi numero es: "+number)
    }

}