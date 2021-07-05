/* Define a function which when given any string, it’ll remove
the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new
string*/

fun getRidOfVowels(s: String): String {
    val re = StringBuilder()
    for (r in s) {
        if (r != 'A' && r != 'a'
            && r != 'E' && r != 'e'
            && r != 'I' && r != 'i'
            && r != 'O' && r != 'o'
            && r != 'U' && r != 'u') {
            re.append(r)
        }
    }
    return re.toString()
}

fun main() {
    println(getRidOfVowels("my assessment five"))
}

