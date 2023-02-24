package com.example.fundamentokotlin

import com.example.fundamentokotlin.POO.Persona
import com.example.fundamentokotlin.dataClass.Group
import com.example.fundamentokotlin.dataClass.User

fun main(){
    newTopic("Colecciones")
    newTopic("Solo lectura")

    val frutaList= listOf("Manzana","Banana","Uva", "Lima")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Uva es: ${frutaList.indexOf("Uva")}  ")

    newTopic("Mutable List")

    val persona1:Persona= Persona("Carlos","Murillo",29)
    val persona2:Persona=Persona("Miriam", "Castillo", 27)

    val usuario1 : User = User(0,"Carlos","Murillo", Group.FAMILY.ordinal)
    val usuario2: User = User(1, "Miriam", "Castillo", Group.FRIEND.ordinal)
    val usuario3: User= User(2,"Josias","De la Cruz",Group.FRIEND.ordinal)

    val personasList = mutableListOf(usuario1,usuario2)
    println(personasList)
    personasList.add(usuario3)
    println(personasList)
    //personasList.removeAt(1)
    personasList.remove(usuario2)
    println(personasList)

    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    userSelectedList.add(usuario1)
    println(userSelectedList)
    userSelectedList.set(0,usuario2)
    println(userSelectedList)


    newTopic("Map")
    val userMap = mutableMapOf<Int,User>()
    println(userMap)
    userMap.put(usuario1.id.toInt(),usuario1)
    userMap.put(usuario1.id.toInt(),usuario1)
    println(userMap)
    userMap.put(usuario2.id.toInt(),usuario2)
    println(userMap)
    userMap.remove(1)
    println(userMap)
    println(userMap.isEmpty())

}