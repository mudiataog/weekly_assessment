fun main() {
    //print 1 to 100
     //printOneToHundred()

  //to reverse a string
    var string = "Good food"
    //println(reverseString(string))

    var print = evenlySpaceNumber(4,6,3)
    println(print)
}

fun evenlySpaceNumber(a:Int, b:Int, c:Int) :Boolean{

    return (a - b == b - c) || (a - c == c - b) || (a - b == c - a)
}

/*Write a short program that prints each number from 1 to 100 on a new line.
  For each multiple of 3, print "Fizz" instead of the number.
  For each multiple of 5, print "Buzz" instead of the number.
  For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number. */
fun printOneToHundred() {
    var a: Int = 0
    for (a in 1..100) {
        if(a%15==0){
            print("FizzBuzz \n")
            continue
        }else if(a % 3 == 0) {
            print("Fizz \n")
            continue
        } else if (a % 5 == 0) {
            print("Buzz \n")
            continue
        }
        println(a)
    }
    a++
}

/* Write a short program that prints the reverse of a string that is supllied.
you can assume that the string passed will never be empty or null.
When given the string "Good food", the output should be "doof dooG". */
var reverse = ""

fun reverseString(str: String): String {

    if(str.length == 1) {
        return str
    } else {
        reverse += str[str.length - 1] + reverseString(str.substring(0, str.length - 1))
        return reverse
    }
}