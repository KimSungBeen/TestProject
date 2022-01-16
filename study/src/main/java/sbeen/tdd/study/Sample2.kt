package sbeen.tdd.study

open class Human(val name: String = "Anonymous") {

    constructor(name: String, age: Int) : this(name) {
        println("my name is $name, $age years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMMYYY~~~")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean: Human() {
    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is ${name}")
    }
}

fun main() {
//    val human = Human("been")
//    val stranger = Human()
//    human.eatingCake()
//
//    println("This human's name is ${stranger.name}")

//    val mom = Human("Kuri", 52)

    val korean = Korean()
    korean.singASong()

}