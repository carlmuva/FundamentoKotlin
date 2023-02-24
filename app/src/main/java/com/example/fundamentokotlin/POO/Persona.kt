package com.example.fundamentokotlin.POO

open class Persona(var nombre:String,var apellido:String, var edad:Int) {

    open fun imprimir(){
        return println("Informacion: Nombre:$nombre, Apellido: $apellido, Edad: $edad")
    }


}