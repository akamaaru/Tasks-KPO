import kotlin.math.sqrt

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    print("Введите фамилию: ")
    val surname: String = readln()

    print("Введите имя: ")
    val name: String = readln()

    print("Введите отчество: ")
    val patronymic: String = readln()

    println("Фамилия: %s".format(surname))
    println("Имя: %s".format(name))
    println("Отчество: %s".format(patronymic))
}

/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val x1: Double
    val x2: Double
    val d: Double = b * b - 4 * a * c

    if (d < 0) {
        return Pair(0.0, 0.0)
    }

    x1 = (-b - sqrt(d)) / a / 2
    x2 = (-b + sqrt(d)) / a / 2

    return Pair(x1, x2)
}

/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 100..999) {
        if (((i % 10) == ((i / 10) % 10)) and
            ((i % 10) == (i / 100)) and
            (((i / 10) % 10) == (i / 100))) {
            println(i)
        }
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 = ${roots.second}")

    printSameDigitNumbers()
}
