fun main() {
    var print = evenlySpaceNumber(4,6,3)
    println(print)
}

fun evenlySpaceNumber(a:Int, b:Int, c:Int) :Boolean{

    return (a - b == b - c) || (a - c == c - b) || (a - b == c - a)
}

