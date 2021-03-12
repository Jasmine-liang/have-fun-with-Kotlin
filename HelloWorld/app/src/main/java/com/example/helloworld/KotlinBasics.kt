package com.example.helloworld

fun main(){


    var myName = "hannah"
    var i : Int = 1
    var j = 2
    var nullAable : String? = "otter"
    nullAable = null
    nullAable?.let { println(it.length) }

    // ?: Elvis operator
     var name1 = nullAable ?: "Guest"

    println(nullAable!!.toUpperCase())

    // You can perform a chain safe calls
    // val myAge: STring? = user?.me?.age ?: 0


   // print("My name is ${5>3}")
//    var season = 4
//    //similar to switch in other language
//    when(season){
//        1 -> println("spring")
//        2 -> println("summer")
//        3 -> println("fall")
//        4 -> println("winter")
//
//        else -> println("Invalid")
//    }

//    var month = 3
//    when(month){
//        in 3..5 -> println("spring")
//        !in 6..8 -> println("summer")
//        in 9..11 -> {
//            println("autumn")
//            println("fall")
//        }
//        12, 1 ,2 -> println("winter")
//        else -> println("invalid")
//    }

//    var x : Any = 12.1f
//    for (num in 1..10){
//        print("$num")
//    }
//    for (i in 1 until  10){
//        print(" $i")
//    }
//    for (i in 10 downTo 1 step 2){
//        print(" $i")
//    }
    var person = Person("l", "lala")

    val user = User(1, "a")
    var name = user.name
    val updateUser = user.copy(name = "nana")

    println(updateUser.component1())
    val(parm1, parm2) = updateUser

}
data class User(val id: Long, var name: String)

fun sum(a: Int, b:Int) :Int{

    return a+b
}
fun test(){

}
class Person (firstName: String, lastName: String){

    var age : Int? = null
    lateinit var sex: String

        init {
            this.sex = "none"
            println("Initialize object")
        }
    fun hello(){
        println("sayhello")
    }
}