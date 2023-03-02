package com.example.mysimplecalculator
import java.util.Scanner

fun main( ) {

    val userInput = Scanner(System.`in`)


    // nextDouble() reads the next double from the keyboard
    print(" Please enter fist number: ")
    val num1 = userInput.nextDouble()
    print(" Please enter second number: ")
    val num2 = userInput.nextDouble()

    print("Enter an operator (+, -, *, /, %): ")
    val operator = userInput.next()[0]


//    if(operator.toString() ==" ")
//        println("do you not want to calculate")

    val output: Double
    when(operator) {

        '+' -> output = num1 + num2
        '-' -> output = num1 - num2
        '*' -> output = num1 * num2
        '/' -> output = num1 / num2
        '%' -> output = num1 % num2

        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            print("Error! Please enter a valid operator")
            return
        }
    }

   println("$num1"+ " $operator" +" $num2"+" = "+"$output")
}


