package Ejercicios

/**
 * Cálculo del sumatorio de 1 a 10, donde a cada elemento
 * se le suma 3.
 */
object Sumatorio {

  final def main(args: Array[String]): Unit = {
    println(Sumatorio())
  }

  /**
   * Genera una lista con todos los números entre el mínimo
   * y máximo, ambos incluidos.
   */
  final def DefinirLista(min: Int, max: Int): List[Int] = {
    if (min == max)
      List(min)
    else
      min::DefinirLista(min + 1, max)
  }

  final def SumatorioLista(lista: List[Int], function: Int => Int): Int ={
    if (lista.isEmpty)
      0
    else
      function(lista.head) + SumatorioLista(lista.tail, function)
  }

  final def Sumatorio(): Int = {
    SumatorioLista(DefinirLista(1, 10), x => x + 3)
  }

}
