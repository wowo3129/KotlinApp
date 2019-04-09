package com.kotlin.kotlinapp

import com.kotlin.KotlinUtils.MathUtils as myfileUtils

/**
 * const val 和 val 共同点都是变量不可变，但是val修饰的变量可以通过反射修改值
 * const val 等价 final
 * val 虽然也不可变，但是不等价final
 * val 运行时常量,类似java 的final，但是final 等同于const val 是编译期常量，他们都不可重复赋值
 * const val 不可以放在方法里面
 */
const val FINAL_HELLO_WORLD: String = "hello2"

var mchar: Char = 'Z'

fun main() {
    /**
     *
     */
    var arg1: Int = 1
    var arg2: Int = 2
    println("$arg1+$arg2 = ${arg1 + arg2}")

    /**
     * hello "Tump"
     */
    var str: String = "hello \"tump\""
    println(str)
    println(str.length)

    /**
     * $1000
     */
    var salary: Int = 1000
    println("$$salary") //$1000
    println("\$salary") //$salary

    var sa: String = """
        这中间是字符串
    """
    println(sa)

    Girl(12, "zhangsan")
    Man(12, "zhangsan")
    val name = getName()
    println(name?.length)
    /**
     * as 给类重命名
     */
    val myfile = myfileUtils()
    val add = myfile.add(1, 2)
    println(add)


    /**
     * 区间
     */
    var range: IntRange = 0..1024 //[0,1024]
    val contains = range.contains(100)
    println(range.isEmpty())
    println(contains)
    println(50 in range)

    var range_exclusive = 0 until 102 //[0,1024) =  [0,1023]
    for (i in range_exclusive) {
        println("$i,")
    }

    /**
     * 数组
     */
    val intArrayOf = intArrayOf(1, 12, 4, 5)
    println(intArrayOf.slice(1..2))
    val booleanArrayOf = booleanArrayOf(true, false, true)
    for (i in booleanArrayOf) {
        println("$i,")
    }

    val s: Array<String> = arrayOf("你好", "谢谢")
    val charArray = CharArray(123)

    for (i in arrayListOf("你好", "谢谢")) {
        println("$i,,,")
    }
    /**
     * ForEach@ 标签，为了return@ForEach 的方式跳出该循环，继续执行下面的语句，而不是终止main()方法
     */
    s.forEach ForEach@{
        if (it.equals("q")) {
            println(it)
            return@ForEach
        }
    }
    s.forEach({ it: String ->
        println(it)
    })

    s.forEach { it: String ->
        println(it)
    }

    s.forEach {
        println(it)
    }

    s.forEach(::println)

    val charArrayOf = charArrayOf('h', 'e', 'l', 'l', 'o')
    println(charArrayOf.joinToString("-"))

    println(Girl::class.java.simpleName)

    /**
     *
     */
    val FINAL_HELLO: String = "hello"

    println(myuser(1))

    /**
     * when 表达式 等同于swicth ,但是支持任意类型
     */
    val temp = 12
    when (temp) {
        in 1..100 -> println("$temp is in 1..100")
        is Int -> println("$temp is int")
        else -> {
            println("$temp is default value")
        }
    }

    when {
        temp < 100 -> println("$temp is < 100")
    }

    /**
     * 接下来我们看下kotlin中和java中if语句的不同之处，
     * kotlin中if 语句是可以有返回值的，而java中只能通过三元表达式来简便操作，
     */
    val i = if (1 < 2) 1 else 2

    /**
     * if 是有返回值的
     */
    val a = 12
    val b = 23

    var max: Any? = if (a < b) {
        a
    } else if (a == b) {
        a + b
    } else {
        Unit
    }

    println("max value is $max")

}

fun getName(): String? {
    return null
}

open class user(age: Int, username: String) {
    init {
        println("帅哥$age + $username")
    }
}

class Girl(age: Int, username: String) : user(age, username)

class Man(age: Int, username: String) : user(age, username)

/**
 * 将函数赋值给一个变量
 */

val myuser = fun(a: Int): Int {
    return 1
}

/**
 * 原始数组集合序列中的每个元素
 * for each element of the original array
 */
fun fun1(args: Array<String>) {
    for (s: IndexedValue<String> in args.withIndex()) {
        println("${s.index} ,${s.value}")
    }

    for ((index, value) in args.withIndex()) {
        println("$index , $value")
    }


    fun fun3() {
        while (true) {
            var s = try {
                println(12)
            } catch (e: Exception) {
                println("$e")
                3
            } finally {
                println(12)
            }

        }
    }
}

fun fun3(){

}




