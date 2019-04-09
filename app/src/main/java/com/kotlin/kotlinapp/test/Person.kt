package com.kotlin.kotlinapp.test

/**
 * 司机接口
 */
interface Driver {
    fun driver()
}

/**
 * ppt写手接口
 */
interface PPTWriter {
    fun write()
}


/**
 * 普通人
 */
class Person : Driver, PPTWriter {
    override fun driver() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

/**
 * 领导  接口代理
 */
class SuperPerson(private val driver: Driver, private val pptWriter: PPTWriter) : Driver by driver,
    PPTWriter by pptWriter {


}

/**
 * 司机
 */
class myDriver : Driver {
    override fun driver() {
        println("我是司机")
    }
}

/**
 * ppt 写字员
 */
class myPPt : PPTWriter {
    override fun write() {
        println("我会写ppt")
    }
}

object user {
    fun test() {
        println("object 修饰的类是最简单的单利")
    }
}
/**
 * 主入口
 * 接口代理： class Manager(driver:Dirver):Driver by driver
 * 老板的活有司机和写字员来干
 */
fun main() {
    /*普通人自己开车写ppt*/
    val person = Person()
    person.write()
    person.driver()
    /*领导招人代开，代写ppt*/
    val myDriver = myDriver()
    val myPPt = myPPt()
    val superPerson = SuperPerson(myDriver, myPPt)
    superPerson.driver()
    superPerson.write()

    user.test()
}

