package ph.stacktrek.novare.ecommercenovare.james.lumba.model

import java.time.LocalDateTime

//var value:Float = 0.0f
//val cost: Double = 0.0
//
//val FINALVALUE = 100
//
//var result:Any = if(value > 100){
//    true
//}else{
//    0
//}

//fun add() = 0
//fun add(value1: Int, value2: Int) = value1 + value2
//fun add(value1: Float, value2:Float):Float{
//    return value1 + value2
//}
//
//fun Int.add(value1: Int, value2: Int) = value1 + value2
//// int fix?
//
//fun add(value1:Double = 0.0, value2: Double) = value1 + value2
//
//fun compute(vararg numbers: Int): Int{
//    var result : Int = 0
//    return result
//}
//
//fun main(args: Array<String>){
//    val minorAgeRange:IntRange = 0 < .. < 17
//}


open class User(val username:String, val password:String) {
    lateinit var email: String
        private set
    lateinit var mobilenumber: String
        private set
    lateinit var userID: String
        private set
    lateinit var accountCreated: LocalDateTime
        private set
    lateinit var lastLogin: LocalDateTime

    constructor(): this("","")

    init{
        println("init called")
    }
}

class ShopOwner() : User() {
    lateinit var shopName: String
        private set

    lateinit var rating: ArrayList<String>
}

class Buyer() : User() {
    lateinit var cart: ArrayList<String>
}