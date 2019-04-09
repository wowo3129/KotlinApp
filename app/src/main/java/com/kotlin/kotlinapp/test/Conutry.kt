package com.kotlin.kotlinapp.test

data class Conutry(var id: Int, var name: String)

fun main() {
    val conutry = Conutry(1, "china")
    conutry.component1()
    conutry.component2()
    println("$conutry")
    var (id, name) = conutry
}