package com.kotlin.kotlinapp

var mchar: Char = 'Z'
fun main() {

    var arg1: Int = 1
    var arg2: Int = 2
    println("$arg1+$arg2 = ${arg1 + arg2}")

    //hello "Tump"
    var str: String = "hello \"tump\""
    println(str)
    println(str.length)

    //$1000
    var salary: Int = 1000
    println("$$salary") //$1000
    println("\$salary") //$salary

    var sa: String = """
        这中间是字符串
    """
    println(sa)

    Girl(12, "zhangsan")
    Man(12, "zhangsan")
}

open class user(age: Int, username: String) {
    init {
        println("帅哥$age + $username")
    }
}

class Girl(age: Int, username: String) : user(age, username)

class Man(age: Int, username: String) : user(age, username)


