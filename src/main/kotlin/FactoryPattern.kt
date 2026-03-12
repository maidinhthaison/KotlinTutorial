package org.example

class FactoryPattern {
    fun main(){
        val pizza : Pizza = Pizza.Factory.createPizza("Peppy Paneer")
        println(pizza.toString())

        //Here calling via Factory reference - don't want to use Factory ref
        //After defining that as companion
        val pizza2 = Pizza.Factory.createPizza("Tomato")
        println(pizza2.toString())
    }

}

class Pizza private constructor (val type: String, val topping: String){
    companion object Factory { // this is factory object
        fun  createPizza(type: String): Pizza{
            return when(type){
                "Tomato" -> Pizza("Tomato", "Pepper")
                "Peppy Paneer" -> Pizza("Paneer farm", "Paneer, Cheese Burst, Tomato, Onion")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }
    override fun toString(): String {
        return "Pizza(type='$type', topping='$topping')"
    }
}