/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.Scanner

fun main() {
    println("Want Beverage? Enter 1 for Tea/ 2 for Coffee!")

    val reader = Scanner(System.`in`)
    var choice:Int = reader.nextInt()

    var beverages: Beverages

    if(choice == 1) {
        beverages = Tea()
        beverages.getBeverage()
    }else if(choice == 2) {
        beverages = Coffee()
        beverages.getBeverage()
    }

}

abstract class Beverages {

    private fun addHotWater() {
        println("Adding hot water")
    }

    private fun addMilk() {
        println("Adding hot milk")
    }

    private fun addSugar() {
        println("Adding Sugar")
    }

    fun getMixture() {
        println("Your Beverage is " + "getting ready...")
        addHotWater()
        addMilk()
        addSugar()
    }

    abstract fun getBeverage()

    abstract fun addIngredients()
}

interface Clean {
    fun cleanPot()
}

class Tea: Beverages(), Clean {


    override fun addIngredients() {
        println("Tea Bag added")
    }

    override fun getBeverage() {
        cleanPot()
        getMixture()
        addIngredients()
        println("Tea's Ready! Enjoy")
    }

    override fun cleanPot() {
        println("Cleaning tea pot...")
    }
}

class Coffee: Beverages(), Clean {

    override fun addIngredients() {
        println("Coffee Bag added")
    }

    override fun getBeverage() {
        cleanPot()
        getMixture()
        addIngredients()
        println("Coffee's Ready! Enjoy")
    }

    override fun cleanPot() {
        println("Cleaning Coffee pot...")

    }
}



