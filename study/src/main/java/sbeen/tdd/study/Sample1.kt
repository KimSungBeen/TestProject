package sbeen.tdd.study

import kotlin.system.measureNanoTime

fun main() {
    //3. String Template

    /*
    val name = "been"
    val lastName = "Kim"
    println("my name is ${name + lastName}")

    println("is this true ${1==0}")
    println("this is 2\$a")
    */

    nullCheck()
}

//1. 함수

fun helloWorld(): Unit {
    println("Hello World")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//2. val vs var
//val = value

fun hi() {
    val a: Int = 10
    var b: Int = 9

    b = 100

    val c = 100
    var d = 100

    val e: String
    var f: String

    var name = "been"
}

//4. 조건식

fun maxBy(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    //Statement
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    //Expression
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("You are genius")
        else -> println("okay")
    }

}

//Expression vs Statement
//값을 반환하면 Expression!! 아니면 Statement
//코틀린의 모든 함수는 Expression임 왜냐하면 반환이 없는 함수들은 Unit을 반환함

//5. Array vs List

//Array

// List
//1. List 2. MutableList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    //Any
    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list[3]

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

// 6. for / while

fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    //for문에서 index와 이름을 함께 사용 가능
    for ((index, name) in students.withIndex()) {
        //index는 0부터 시작함
        println("${index + 1}번째 학생: $name")
    }

    var sum: Int = 0

    for (i in 1..10) {
        //1 ~ 10
        sum += i
    }
    println(sum)

    for (i in 1 until 100) {
        //1 ~ 99
    }

    for (i in 10 downTo 1) {
        //10 ~ 1
    }

    var index = 0
    while (index < 10) {
        println("current index is $index")
        index++
    }
}

//7. Nullable / NonNull
// 자바와 코틀린의 가장 다른 특징!!

fun nullCheck() {
    //NPE: Null Pointer Exception

    var name: String = "been" // NonNull
    var nullName: String? = null //Nullable
    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase() // null이면 null 반환 / null이 아니면 uppercase 실행

    // ?:
    val lastName: String? = null
    val fullName = name + (" ${lastName ?: "No LastName"}")

    println(fullName)

    //!! - 확실하게 Null이 아니면 사용할 수 있지만 되도록 지양하자

}

fun ignoreNulls(str: String?) {
    val notNull: String = str!!
    val upper = notNull.uppercase()

    val name: String? = null

    //잘못된 방법인것 같음 내 블로그 제대로된 let 사용법 참고
    //https://been1130.tistory.com/31
    name.let {
        val email = "$name@kakao.com"
    }
}