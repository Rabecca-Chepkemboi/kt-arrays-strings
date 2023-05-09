fun main(){

    number()

    peopleDetail()

    var answe = name("Issah", "Omosh", "Esther")
    println(answe)

    val motor = listOf(
        Car("scfehf34", 23454.70),
        Car("gfsbdd45", 34852.55),
        Car("bhddhd89", 89536.02),
    )


    val average = calculateMileage(motor)
    println(average)

}


//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

fun number(){
    var num1 = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(num1[1].plus(num1[4]))
    println(num1.indexOf(158))
    println(num1.sortedArray().contentToString())
}


//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
// Sort the list in order of descending age (2 points)

data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
fun peopleDetail(){
    var person1 = Person ("Adriel", 14, 5.2, 56.9)
    var person2 = Person ("Clarah", 26, 8.6, 72.6)
    var person3 = Person ("Vince", 30, 3.4, 44.0)

    var personList = listOf(person1, person2, person3)
    var sorted = personList.sortedByDescending { person -> person.age }
    println(sorted)
}


//3. Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)

fun name (a: String, b: String, c: String): Array<String>{
    return arrayOf(a, b, c)
}


//4. Write a function that takes in a list of Car objects each with a registration
// and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)

data class Car(val registration:String, val mileage: Double)
fun calculateMileage(motor: List<Car>): Double{
    var totalMileage = 0.0
    for (cars in motor){
        totalMileage +=cars.mileage
    }
    return totalMileage / motor.size
}
