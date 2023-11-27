/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val found: MutableList<String> = mutableListOf()
    val result: MutableList<String> = mutableListOf()

    for (i in array.indices) {
        if (found.contains(array[i])) {
            result.add("blahblah")
        } else {
            result.add(array[i])
            found.add(array[i])
        }
    }

    return result
}

/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val count: Int = 0
    val words = text.split("\\s+".toRegex())
    return words.distinct().size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = readln()
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    println(replaceElements(text.split("\\s+".toRegex())))
}
