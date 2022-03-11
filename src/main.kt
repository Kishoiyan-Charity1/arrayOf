 fun main() {
//Create a function that takes in 4 strings  and creates an array out of them then
//prints out the array
     names(arrayOf("tom", "anna", "ken","zuena"))
     cities()
     add(arrayOf())
     all(arrayOf("i","am","ritty"))

 }
 //Create a function that given an array below:
 //var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
 //prints out the names of the cities in the correct grammatical case.
 fun names(a:Array<String>) {
     println(a.contentToString())
 }
//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { place->
        println(place.capitalize())

    }
    }
 fun add(numb:Array<Int>) {
     var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
     println(numbers[1] +numbers[4])
     println(numbers.indexOf(158))
     println(numbers.sorted())
 }
 //Create a function that takes in 3 names and returns a string array containing
// all 3 names.
fun all(three:Array<String>) {
    println(three.contentToString())

}











