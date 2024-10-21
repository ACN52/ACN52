import java.util.Locale

fun main() {
    // Блок ввода чисел
    // --------------------
    var x: Double = 5.0
    var y: Double = 10.0
    var z: Double = 0.0

    println("Первое число: $x")
    println("Второе число: $y")
    println()
    // x = readlnOrNull()?.toDoubleOrNull() ?: 0.0 // Преобразуем строку в Double, если ввод некорректен,
                                            // устанавливаем 0.0
    // --------------------

    // Операции над числами
    // --------------------
    fun operations(input: Any) {
        when (input) {
            "+" -> println("Сумма чисел $x и $y = ${x + y}")
            "-" -> println("Разность чисел $x и $y = ${x - y}")
            "*" -> println("$x умножить на $y = ${x * y}")
            "/" -> if (y != 0.0){
                    z = x / y
                    println("$x делить на $y = ${String.format(Locale.US, "%.6f", z)}")
                    } else {
                     println("Ошибка ! Деление на 0.")
                    }

        }
    }

    operations("+")
    // --------------------

}




