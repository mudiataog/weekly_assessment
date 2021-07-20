/*Given a random non-negative number, you have to return the
digits of this number within an array in reverse order. Example:
348597 => [7,9,5,8,4,3]
258 => [8,5,2]*/

fun main() {
    print(reverseNum(listOf(2,5,8)))
}

fun reverseNum(list: List<Int>): List<Int> {
    val numbers = arrayListOf<Int>()
    for (i in list.indices) {
        val nums = list[list.size - 1 - i]
        numbers.add(nums)
    }
    return numbers
}