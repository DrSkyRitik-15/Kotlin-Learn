fun main(){
    var arr=arrayOf("One","Two","Three")
    for (i in arr) {
        println(i)
    }
    println("Array with Index")
    for ((i,e) in arr.withIndex()) {
        println("$i - $e")
    }
    println("Particular index")
    println(arr[0])
    println(arr.get(1))
    println("After set")
    arr.set(2,"Kool")
     for (i in arr) {
        println(i)
    }
    println("Array Size  ")
    println(arr.size)
    var arr2=arrayOf(1,2,3) // implicit array
    var arr3=arrayOf<Int>(5,33,3) // Explicit array
} 