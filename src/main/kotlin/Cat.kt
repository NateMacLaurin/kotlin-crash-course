/*class Cat: Animal("cat") {
    fun meow(){
        println("Meow!!!");
    }
}*/

//override function for abstract function in Animal
class Cat: Animal("cat") {
    override fun makeSound(){
        println("Meow!!!");
    }
}