/**
Задание 1: Сформировать целочисленный массив A из N элементов
при помощи ввода значений с клавиатуры (N вводит пользователь).
Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    val n: Int = readln().toInt()
    return Array(n) { _ -> readln().toInt() }
}

/**
Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    return arr.sortDescending()
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()
    print("arr = ")
    println(arr.joinToString())

    print("arr sorted descending = ")
    sortArrayDesc(arr)
    println(arr.joinToString())
}
