package com.example.fundamentokotlin.POO

class Empleado(nombre:String,apellido:String,edad:Int,var salario:Long,val dias:Int):Persona(nombre,apellido,edad) {

    fun calcular():Long{

        return this.salario*this.dias

    }

    override fun imprimir(){
        return println("${super.imprimir()}"+" ${calcular()}")
    }




}