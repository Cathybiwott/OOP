fun main() {
    var Cathy = Human("Cathy",20,47)
    Cathy.eat(2)
    Cathy.speak("Hello world!")
    Cathy.birthday(1)
    var details = Details("Cathy","Bikens","cathybikens@gmail.com","723846319","379940b")
    println(details.lastname)
    println(details.email)




}

class Human(var name:String,var age:Int,var Weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating food $foodWeight kgs of food")
        Weight+=foodWeight
        println(Weight)
    }

    fun speak(speech: String){
        println(speech)
    }
    fun birthday(add:Int){
        var sum=age+ add
        println(sum)
    }
}
data class Details(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)


