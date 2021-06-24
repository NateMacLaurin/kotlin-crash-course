//classes
/*class Animal(
    //constructors in parenthesis
    val name: String
) {
    init {
        println("Hello my name is $name");
    }
}*/

//inheritance - open class tag - allows this class to become parent
/*open class Animal(
    //constructors in parenthesis
    val name: String,
    val legCount: Int = 4
) {
    init {
        println("Hello my name is $name");
    }
}*/

//abstract - abstract class tag - we can't create just an animal
abstract class Animal(
    //constructors in parenthesis
    val name: String,
    val legCount: Int = 4
) {
    init {
        println("Hello my name is $name");
    }
    //creates a function that all children can use
    abstract fun makeSound()
}