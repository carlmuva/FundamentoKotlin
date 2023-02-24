package com.example.fundamentokotlin.classes

class Smartphone(number:Long, val isPrivate:Boolean): Phone(number) {

    override fun showNumber() {
        if(isPrivate) println("Desconocido") else super.showNumber()

    }

}