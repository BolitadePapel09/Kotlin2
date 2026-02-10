fun main() {

    println(" EJERCICIO 1 ")
    val semana = ejericicio1(dia = 5)
    println(semana)
    println(" EJERCICIO 2")
    val nota = ejercicio2(calificacion = 9)
    println(nota)
    println("EJERCICIO 3")
    val semaforo = ejercicio3(color = "amarillo")
    println(semaforo)
    println("EJERCICIO 4")
    val acceso = ejercicio4(rol = "root")
    println(acceso)

    println("EJERCICIO 5")
    ejercicio5()
    println(" EJERCICIO 6 ")
    ejercicio6()
    println("EJERCICIO 7 ")
    ejercicio7()
    println(" EJERCICIO 8")
    ejercicio8()
}

fun ejericicio1(dia : Int) : String{

    when (dia) {
        1 -> return "Lunes"
        2 -> return "Martes"
        3 -> return "Miercoles"
        else -> return "Dia invalido"
    }
}


fun ejercicio2(calificacion : Int) : String {
    when (calificacion) {
        10 -> return "Excelente"
        9 -> return "Muy bien"
        8 -> return "Bien"
        else -> return "Reprobado"
    }
}

fun ejercicio3(color : String) : String {
    when (color) {
        "rojo" -> return "Alto"
        "amarillo" -> return "Precaucion"
        "verde" -> return "Avanza"
        else -> return "Color invalido "
    }
}

fun ejercicio4(rol : String) : String {
    when (rol) {
        "admin" -> return "Acceso total"
        "user" -> return "Acceso limitado"
        "invitado" -> return "Modo lectura"
        else -> return "Rol desconocido"
    }
}

fun ejercicio5(){
    for(i in 1..5)
        println(i)
}

fun ejercicio6() {
    for (i in 1..3)
        println("Hola Kotlin")
}

fun ejercicio7() {
    val nombres = arrayOf("Ana", "Luis", "Carlos")

    for(i in nombres.indices){
        println(nombres[i])
    }
}

fun ejercicio8() {

    val numeros = arrayOf(10, 20, 30)
    // numeros.size ayuda a contar cuantos elementos hay (en este caso 3)
    // Los indices empiezan en 0 por ende hay que disminuir 1
    // until nos ayuda a contar antes del ultimo, en este caso como es 3 el total, pasara a 2 por el until
    for(i in 0 until numeros.size)
        println("Indice $i")
}