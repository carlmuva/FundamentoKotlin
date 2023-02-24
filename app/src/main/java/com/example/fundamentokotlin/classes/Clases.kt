package com.example.fundamentokotlin.classes

import com.example.fundamentokotlin.newTopic

fun main(){
    newTopic("CLASES")

    val phone: Phone = Phone(8188056457)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")

    val smartphone = Smartphone(8188056457, true)
    smartphone.call()
    smartphone.showNumber()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

}