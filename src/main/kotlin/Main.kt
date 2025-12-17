package org.example

import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var choose : Boolean = false

    do {
        print("Input action: ")
        val select = readln()
        when (select) {
            "1" -> println("Hello World!")
            "2" -> println("Hello World!111111")
            "3" -> {
                println("Exit!")
                choose = true
                exitProcess(0)
            }else -> {
                choose = true
                exitProcess(0)
            }
        }
    }while(choose == false)
}