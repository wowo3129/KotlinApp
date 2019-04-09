package com.kotlin.kotlinapp.test

/**
 * 总接口
 */
interface InputDevice {
    fun input(event: Any)
}

/**
 * 子接口
 */
interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

/**
 * 抽象类
 */
abstract class bLEmourse(var name: String) : BLEInputDevice {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return "$name"
    }


}

/**
 * 实现类
 */
class luojiBleMourse : bLEmourse("罗技鼠标") {

}

/**
 * 功能类
 */
class Computer {

    fun addUsbInputDevice(inputDevice: USBInputDevice) {
        println("this is usb $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) {
        println("this is ble $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            is USBInputDevice -> {
                addUsbInputDevice(inputDevice)
            }
            else -> {
                println("不支持该设备输入")
            }

        }
    }

}

/**
 * 主入口
 */
fun main() {
    var computer = Computer()
    var bLEmourse = luojiBleMourse()
    computer.addInputDevice(bLEmourse)
}