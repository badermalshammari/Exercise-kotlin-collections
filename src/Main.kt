
//Part 1: Working with Lists
val fruits = mutableListOf("Apple", "Banana", "Orange")

// Part 2: Working with Sets
val numbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5)

// Part 3: Working with Maps
val countriesAndCapitals = mutableMapOf(
    "USA" to "Washington",
    "France" to "Paris",
    "Germany" to "Berlin"
)
//Part 4: Using ArrayList
val carBrands = arrayListOf("BMW", "Toyota", "Honda")

//Part 5: Advanced Collection Operations
val p5Numbers = listOf(10, 5, 20, 15, 25, 30)
val greaterThan15 = p5Numbers.filter { it > 15 }
val sortedNumbers = p5Numbers.sorted()

//Part 6: Finding Maximum & Minimum Values
val p6Numbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
val maxNumber = p6Numbers.maxOrNull()
val minNumber = p6Numbers.minOrNull()



fun main() {
//Part 1: Working with Lists
    fruits.add("Mango")
    fruits.removeAt(1)
    println(fruits)

// Part 2: Working with Sets
    numbers.add(3)
    numbers.add(6)
    println(numbers)

// Part 3: Working with Maps
    countriesAndCapitals["Canada"] = "Ottawa"
    println("countries = ${countriesAndCapitals.keys}")
    println("Capitals = ${countriesAndCapitals.values}")
    countriesAndCapitals.remove("France")
    println(countriesAndCapitals)

    //Part 4: Using ArrayList
    carBrands.add("Nissan")
    carBrands.add("Ford")
    carBrands.remove("BMW")
    println(carBrands)

//Part 5: Advanced Collection Operations
    println("Numbers greater than 15: $greaterThan15")
    println("Sorted List: $sortedNumbers")

    //Part 6: Finding Maximum & Minimum Values

    println("Largest number: $maxNumber")
    println("Smallest number: $minNumber")

}