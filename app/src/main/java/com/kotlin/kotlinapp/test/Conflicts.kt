package com.kotlin.kotlinapp.test

interface AOne {
    fun x(): Int = 1
}

interface BOne {
    fun x(): Int = 2
}

abstract class COne {
    open fun x(): Int = 4
}

/**
 * 继承实际上是继承类的构造方法
 */
class DOne(var y: Int = 1) : COne(), AOne, BOne {

    override fun x(): Int {
        if (y > 0) {
            return super<AOne>.x()
        } else {
            return super<BOne>.x()
        }
    }
}

/**
 * 父类要open才会被继承
 * 父类方法属性需要open才会被继承
 * 接口接口方法默认open
 * 复写父类接口成员需要override关键字
 * 接口方法可以有默认实现
 * 接口方法冲突 签名一致且返回值相同的冲突
 * 子类必须复写冲突方法
 * super<父类>.方法名(参数列表)
 * internal 模块内可见 peotected 子类可见
 */

fun main() {
    println(DOne(1).x())
    println(DOne(-1).x())
}