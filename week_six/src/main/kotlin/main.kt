/*Timmy & Sarah think they are in love, but around where they
live, they will only know once they pick a flower each. If one of
the flowers has an even number of petals and the other has an odd
number of petals it means they are in love. Write a function that will take the number of petals of each flower
and return true if they are in love and false if they aren't. Eg.
inLove(4, 4) -> false
inLove(3,11) -> false
inLove(22, 17) -> true
*/
fun main(){
    println(loveDetector(22,17))
    println(loveDetector(3,11))
}

fun loveDetector(flower1:Int, flower2:Int): Boolean{
    return flower1 % 2 !== flower2 % 2;
}