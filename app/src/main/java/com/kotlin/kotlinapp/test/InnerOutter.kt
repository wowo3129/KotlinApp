package com.kotlin.kotlinapp.test


/**
 * 加上open 关键字后可被继承
 */
open class Outter {
    var a = 1

    /**
     * 默认是静态内部类
     */
    class StaticInner

    /**
     * 默认是静态内部类，除非通过加上inner关键字后变为非静态
     */
    inner class Inner {
        var a = 2
        fun test() {
            println(Outter().a)
            println(this@Outter.a)
            println(this@Inner.a)
        }

    }

}

fun main() {
    /**
     * kotlin内部类默认是静态的加上inner后变为静态,java内部类默认是非静态的
     */
    val innerStatic = Outter.StaticInner()

    /**
     * 匿名内部类使用,跟java不同的是匿名内部类可以继承一个类，实现多个接口，不常用
     */
    var view = view()
    view.OnclickListener = object : Outter(), OnClickListeners {
        override fun onClicks() {

        }
    }

}

class view {
    var OnclickListener: OnClickListeners? = null
}

interface OnClickListeners {
    fun onClicks()
}
