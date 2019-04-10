import java.lang.Exception
import java.lang.Integer.parseInt
import kotlin.collections.ArrayList

object Ingredientes {
    const val agua = "Agua"
    const val leche = "Leche"
    const val carne = "Carne"
    const val verduras = "Verduras"
    const val frutas = "Frutas"
    const val cereal = "Cereal"
    const val huevos = "Huevos"
    const val aceite = "Aceite"
}

fun readResponse(): Int {
    return try {
        parseInt(readLine())
    } catch (e: Exception) {
        0
    }
}

fun main() {
    val recetas: ArrayList<ArrayList<String>> = arrayListOf()

    println(":: Bienvenido a Recipe Maker ::")

    do {
        println(
            """

Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    """.trimMargin()
        )

        val response: Int = readResponse()

        when (response) {
            1 -> {
                println("\tAgregar un ingrediente")
                var agregar = true
                val receta: ArrayList<String> = arrayListOf()
                do {
                    println("\tSelecciona un ingrediente")

                    println("\t\t1. Agua")
                    println("\t\t2. Leche")
                    println("\t\t3. Carne")
                    println("\t\t4. Verduras ")
                    println("\t\t5. Frutas ")
                    println("\t\t6. Cereal")
                    println("\t\t7. Huevos")
                    println("\t\t8. Aceite")
                    println("\t\t9. Salir")

                    val responseI: Int = readResponse()
                    when (responseI) {
                        1 -> {
                            receta.add(Ingredientes.agua)
                            println("\tAgregado: agua")
                        }
                        2 -> {
                            receta.add(Ingredientes.leche)
                            println("\tAgregado: Leche")
                        }
                        3 -> {
                            receta.add(Ingredientes.carne)
                            println("\tAgregado: carne")
                        }
                        4 -> {
                            receta.add(Ingredientes.verduras)
                            println("\tAgregado: verduras")
                        }
                        5 -> {
                            receta.add(Ingredientes.frutas)
                            println("\tAgregado: frutas")
                        }
                        6 -> {
                            receta.add(Ingredientes.cereal)
                            println("\tAgregado: cereal")
                        }
                        7 -> {
                            receta.add(Ingredientes.huevos)
                            println("\tAgregado: huevos")
                        }
                        8 -> {
                            receta.add(Ingredientes.aceite)
                            println("\tAgregado: aceite")
                        }
                        9 -> {
                            agregar = false
                        }
                    }

                } while (agregar)
                recetas.add(receta)
            }
            2 -> {
                recetas.forEachIndexed { index, item ->
                    println("Receta ${index + 1}: $item")
                }
            }
        }

    } while (response != 3)
}
