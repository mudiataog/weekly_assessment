fun main() {
    //To print if statements
    var printStatement = ifStatements(12,7, 20)
    println(printStatement)

    //To print from 1 to 100
    print1To100()

//To print old and even numbers
    printOldAndEvenNumbers()

    var cat : Animal = Animal("tom", 10, "Eba", 200, "cat1")
    cat.setAnimalName("TOM TOM")
    println(cat.getAnimalName())

    var student : Student = Student("John", 20, "Fried Rice", 70, "Lagos")
    student.setStudentName("Obiku Princilia")
    println(student.getStudentName())
}
/* 1. Define 10 if statements and 5 conditional expressions
using the when keyword. */
fun ifStatements(a:Int, b:Int, c:Int) {
    if (a > b) {
        println("$a is greater than $b")
    }

    if(a<b){
        println ("$a is less than $b")
    }

    if(a<=b){
        println("$a is less than or equal to $b")
    }

    if(a>=b){
        println("$a is greater than or equal to $b")
    }

    if (a==b){
        println("$a is equal to $b")
    }

    if (a!=b){
        println("$a is not equal to $b")
    }

    //Conditional Statements
    if(a<b){
        println("a is less than b ")
    }else{
        println("a is greater than b")
    }

    if(a!=b){
        println("a is not equal to b")
    }else{
        println(" a is equal to b")
    }
}

/* 2. Define a loop which will print out 1 - 100. Also define a
loop which will print out 1 - 10 to the console without
printing out the numbers 4 and 5.*/
fun print1To100() {
    for(n in 1..100){
        print("$n")
    }
}

/* 3. Using a loop and the modulus operator, write a program
which will print out only the even numbers between 10 and
20 and the odd numbers between 20 and 30: NB: Use
only one loop */
fun printOldAndEvenNumbers(){
    for (a in 10..30){
        if(a%2==0 && a<21){
            println("Even Number: $a")
        }else{
            if(a%2!=0 && a>20){
                println("Old Number: $a")
            }
        }
    }
}



/* 4. Define 5 Classes; let each class definition contain at least 5 instance variables;
let each class contain at least 1 constructor.
• Assign values to the instance variables in these classes and then print out the values in
the main function by accessing the values. NB: Use getters and setters. */
class Animal {
    //instance variables
    var name : String = ""
    var age : Int = 0
    var food : String = ""
    var weight : Int = 0
    var breed : String = ""
    //constructor
    constructor(animalName: String, animalAge: Int, animalFood:String, animalWeight:Int, animalBreed:String ){
        this.name = animalName
        this.age = animalAge
        this.food = animalFood
        this.weight =  animalWeight
        this.breed =  animalBreed
    }
    //using getter and setter
    fun getAnimalName():String{
        return this.name
    }
    fun setAnimalName(animalName: String){
        this.name = animalName
    }
}

class Student {
    //instance variables
    var name : String = ""
    var age : Int = 0
    var food : String = ""
    var weight : Int = 0
    var address : String = ""
    //constructor
    constructor(studentName: String, studentAge: Int, studentFood:String, studentWeight:Int, studentAddress:String ){
        this.name = studentName
        this.age = studentAge
        this.food = studentFood
        this.weight = studentWeight
        this.address = studentAddress
    }
    //using getter and setter
    fun getStudentName():String{
        return this.name
    }
    fun setStudentName(studentName: String){
        this.name = studentName
    }
}

/* 5. create 2 Repositories with 3 files in each of them.
Push and pull to and from these repositories at least twice using the command line or terminal on your
windows PC or Mac. */

