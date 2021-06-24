class Dog : Animal("Dog") {
    /*init {
        //we have access to parent class properties
        legCount
    }*/

    override fun makeSound(){
        println("Woof!!!");
    }
}