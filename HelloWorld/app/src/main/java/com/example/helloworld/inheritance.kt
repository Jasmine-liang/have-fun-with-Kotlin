package com.example.helloworld

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("may have a implementation")
    }
}

//all classes in Kotlin are final,
// use open key word to make this class inheritable
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0
    fun extendRange(amount: Double){
        if (amount > 0)
            range += amount
    }
    override fun drive(): String{
        return "drive"
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Car(maxSpeed,name, brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double) {
       println("Drove for $distance KM on Tesla")
    }

    override fun drive(): String {
        return "lala"
    }

}

fun main(){
    var myCar = Car(2.0,"A1", "Audi")
    var myECar = ElectricCar(1.0, "1", "Tesla", 85.0)

    myECar.extendRange(211.0)
    myCar.drive(200.0)
    myECar.drive(200.0)

}