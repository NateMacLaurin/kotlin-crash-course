import java.lang.Exception

fun main() {
    /*//var is variable, val is like a js constant
    //don't forget camel case for variable names
    val wholeNumber = 3 //32 bit int
    val bigWholeNumber = 3L // L on the end of an int creates a 64-bit int
    val preciseDecimal = 3.33 // precise decimal
    val decimal = 3.33f // decimal
    val iLoveVegetables = true //bool
    val iAmALetter = 'a' //character

    println("The value of wholeNumber is $wholeNumber")
    println("The value of preciseDecimal is $preciseDecimal")

    val x = 3 / 4 //don't forget to cast as a decimal to hold remainder!
    val x1 = 3f / 4f //cast as decimal
    val x2 = 10 % 3 //modulo captures the remainder

    println("The value of x is $x")
    println("The value of x1 is $x1")

    //booleans
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = (amIAnAdult && amIAProgrammer)
    println(amIAnAdultProgrammer)

    //strings
    val string = "Kotlin is awesome!"
    println(string)

    //if conditions
    val a = 1 + 1
    if(a == 4) {
        println("a is equal to 2.")
    } else if(a == 3) {
        println("a is equal to 3.")
    } else {
        println("a is not equal to 2 or 3.")
    }

    //kotlin is null safe
    val x: Int? = null;

    //readLine returns nullable string
    val userInput = readLine();

    //won't work with strings, need to convert to integers
    val result = number1 + number2;


    val number1 = readLine();
    val number2 = readLine();

    //
    val result = number1!!.toInt() + number2!!.toInt();

    //use double !! to signify we guarantee not null
    console.log(result);
    */
    //lists
    //immutable list:
    //val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex");
    //println(shoppingList[3]);

    //mutable list:
    //val shoppingList = mutableListOf<String>("Lamborghini", "Penthouse", "Rolex");
    //don't need to specify the string type:
    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex");

    shoppingList.add("Ferrari");
    println(shoppingList);

    //while loops
    /*var counter = 0;
    while(counter < shoppingList.size){
        println(shoppingList[counter]);
        counter++;
    }*/

    //for loops
    /*for(shoppingItem in shoppingList){
        println(shoppingItem);
    }*/

    for(i in 1..100){
        println(i);
    }

    //when expression
    val x  = 3;
    when(x){
        in 1..2 -> println("x is between 1 and 2");
        in 3..10 -> println("x is between 3 and 10");
        else -> {
            println("x is not in the range of 1 to 10");
        }
    }

    //functions
    print10Numbers();
    //can define the specific val to assign in the function call
    val y = isEven(number = 5);
    val z = 5
    println(y);
    //calling extension function
    println(z.isOdd());

    //classes
    //val dog = Animal("Dog");
    val dog = Dog();
    dog.makeSound();
    val cat = Cat();
    cat.makeSound();

    //anonymous classes
    val bear = object : Animal("Camembear") {
        override fun makeSound() {
            println("RAWR!!! XD");
        }
    }

    bear.makeSound();

    //exceptions
    /*val numberino = readLine() ?: "0"
    //need to catch the string->int conversion exception
    //numberino.toInt();

    val parsedNumber = try {
        numberino.toInt();
    }catch (e: Exception){
        //assign parsed number this if we catch
        0
    }
    println(parsedNumber);*/

    //lambda functions - functions we pass as a variable to another function
    val listy = listOf("Kotlin", "is", "fun");
    val counterino = listy.customCount { currentString ->
        currentString.length >= 3;
    }
    println(counterino);
}

//lambda functions
//extend function list of type string. declaring customCount called with a function which takes a string as paramenter
//and returns a boolean. whole function returns type integer
/*fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0;
    for(string in this){
        if(function(string)){
            counter++;
        }
    }
    return counter;
}*/

//generic function - T is placeholder for any type
fun <T>List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0;
    for(string in this){
        if(function(string)){
            counter++;
        }
    }
    return counter;
}

//functions
fun print10Numbers() {
    for(i in 1..10){
        println(i);
    }
}
//functions name(var name: type = default val): return type {}
fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0;
}

//extension function type.name(): return type {} return "this"
fun Int.isOdd(): Boolean {
    return this % 2 == 1;
}