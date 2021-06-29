//Assignment_4
/** Define a function thus; given three ints, a b c, one of them is small, one is
medium and one is large. Return true if the three values are evenly spaced,
so the difference between
small and medium is the same as the difference between medium and large.
evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false */

fun main(args: Array<String>) {
    intSpace(2,4,6)
}

fun intSpace (a: Int, b: Int, c: Int,){
    when {
        (b - a) == (c - b) -> println("evenly spaced, true")
        else -> println("evenly spaced, false")
    }
}