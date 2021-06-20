/*Question: Write a short program that prints
each number from 1 to 100 on a new line.*/

fun main(arg: Array<String>) {

    (1..100).forEach { i ->
        println(i)
    }
}

//For each multiple of 3, print "Fizz" instead of the number.

fun main(arg: Array<String>) {
  for(i in 1..100 step 3) {
      println("Fizz")
  }
}

//For each multiple of 5, print "Buzz" instead of the number.

fun main(arg: Array<String>) {

    for ( i in 1..100 step 5) {
        println("Buzz")
    }
}

/*For numbers which are multiples of both 3 and 5,
print "FIZZBUZZ" instead of the number */

fun main(arg: Array<String>) {
    for(i in 1..100 step 3) {
        for(i in 1..100 step 5)
        println("FizzBuzz")
    }
}

/*Question: Write a short program that prints the reverse of a string that is supplied. 
You can assume that the string passed will never be empty or null. When given the 
string "Good food", the output should be "doof dooG" */ 

fun main() {

    val str = "Good food"

    var result: String = ""
    var lastIndex = str!!.lastIndex

    while (lastIndex >= 0) {
        result += str[lastIndex]
        lastIndex--
    }

    println("\"$result\"")
}
