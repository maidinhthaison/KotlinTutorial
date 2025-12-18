package org.example

import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var choose : Boolean = false
    val actions = arrayOf("Loops", "When", "Array", "Functions")
    do {
        println("----------Application----------")
        actions.forEachIndexed { index, value ->
            println("${index+1}: $value")
        }
        println("----------Input action----------")
        val select = readln()

        when (select) {
            "1" -> {
                val loops = Loops()
                loops.main()
            }
            "2" -> {
                val whenUtils = WhenUtils()
                whenUtils.main()
            }
            "3" -> {
                val arrays = Arrays()
                arrays.main()
            }
            "4" -> {
                val functions = Functions()
                functions.main()
            }else -> {
                println("Exit!")
                choose = true
                exitProcess(0)
            }
        }
        println("\n")
    }while(choose == false)
}