package com.example.fundamentokotlin.dataClass

import com.example.fundamentokotlin.newTopic

fun main(){
    newTopic("Data Class")

    val usuario1 :User =User(0,"Carlos","Murillo",Group.FAMILY.ordinal)
    val usuario2: User = User(1, "Miriam", "Castillo", Group.FRIEND.ordinal)

    println(usuario1.component3())
    println(usuario1)
    println(usuario2)

    newTopic("Funciones de alcance")

    with(usuario2){
        lastName="Castillo Cavazos"
        Group.FAMILY
    }
    println(usuario2)

    usuario1.apply {
        group=Group.WORK.ordinal
        name ="Abraham"

    }

    println(usuario1)

}