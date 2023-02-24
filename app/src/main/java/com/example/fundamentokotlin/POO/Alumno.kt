package com.example.fundamentokotlin.POO

class Alumno(nombre:String,apellido:String,edad:Int,var matricula:Long, var contraseña:String):Persona(nombre,apellido,edad) {


    override fun imprimir(){



        return println("${super.imprimir()}, ${this.matricula},${this.contraseña}")

    }
}