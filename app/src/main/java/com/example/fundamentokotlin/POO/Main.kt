package com.example.fundamentokotlin.POO

import com.example.fundamentokotlin.newTopic

fun main(){

    newTopic("Herencia")

    val persona1:Persona= Persona("Carlos","Murillo",29)
    val persona2:Alumno = Alumno("Miriam","Castillo",27,1488999,"frodo95")
    val persona3:Empleado= Empleado("Josias","De la Cruz",23,1000,30)

    /*persona1.imprimir()
    persona2.imprimir()
    persona3.imprimir() */

    var nombre:String; var apellido:String; var edad:Int;  var matricula: Long; var contraseña: String; var salario: Long; var dias: Int;
    var tipo: Int; var op1: Int;

    val lista= mutableListOf<Persona>(persona1,persona2,persona3)
    val lista2= listOf<Persona>(persona1,persona2,persona3)

   lista2.toString()

    /*println("Hola que quieres hacer? 1.Registrar informacion 2.Salir")
    op1=readLine()!!.toInt()

    if(op1==1) {
        while (op1 < 2) {
            println("Hola ¿que tipo de usuario eres? 1.Alumno o 2.Empleado 3. Ninguno")
            tipo = readLine()!!.toInt()

            if (tipo == 1) {
                println("Eres un alumno")
                print("Nombre: ")
                nombre = readLine().toString()
                print("Apellido: ")
                apellido = readLine().toString()
                print("Edad: ")
                edad = readLine()!!.toInt()
                print("Matricula: ")
                matricula = readLine()!!.toLong()
                print("Contraseña: ")
                contraseña = readLine().toString()
                val persona: Alumno = Alumno(nombre, apellido, edad, matricula, contraseña)
                println("Registro completado")
                persona.imprimir()
                op1++

            } else if (tipo == 2) {
                println("Usted es un empleado")
                print("Nombre: ")
                nombre = readLine().toString()
                print("Apellido: ")
                apellido = readLine().toString()
                print("Edad: ")
                edad = readLine()!!.toInt()
                print("Salario: ")
                salario = readLine()!!.toLong()
                print("Dias: ")
                dias = readLine()!!.toInt()
                val persona: Empleado = Empleado(nombre, apellido, edad, salario, dias)
                println("Registro completado")
                persona.imprimir()
                op1++

            } else if (tipo == 3) {
                println("Usted es una persona normal")
                print("Nombre: ")
                nombre = readLine().toString()
                print("Apellido: ")
                apellido = readLine().toString()
                print("Edad: ")
                edad = readLine()!!.toInt()
                val persona: Persona = Persona(nombre, apellido, edad)
                print("Registro completado")
                persona.imprimir()
                op1++
            }
        }
    }else println("Servicio terminado")



    /*println("Nombre: ")
    nombre = readLine().toString()
    println("Apellido: ")
    apellido = readLine().toString()
    println("Edad: ")
    edad = readln().toInt()
    val persona4:Persona = Persona(nombre,apellido,edad)

    persona4.imprimir()*/

*/

}