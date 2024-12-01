/* Algoritmos de búsqueda */

// Búsqueda lineal (Secuenciales)
fun linearSearch(array: List<Int>, target: Int): Int {
    for (i in array.indices) {
        if (array[i] == target) return i
    }
    return -1
}

// Búsqueda binaria
fun binarySearch(array: List<Int>, target: Int): Int {
    var start = 0
    var end = array.size - 1

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            array[mid] == target -> return mid
            array[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }
    return -1
}

fun main(args: Array<String>) {
    val list1 = List(10000) { it }
    val list2 = List(10000) { (1..10000).random() }

    val linearResult = linearSearch(list2, 5000)
    val binaryResult = binarySearch(list1, 5000)

    println("Resultado de busqueda lineal: $linearResult")
    println("Resultado de busqueda binaria: $binaryResult")
}