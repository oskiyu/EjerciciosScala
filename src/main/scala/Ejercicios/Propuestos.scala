package Ejercicios

object Propuestos {

  // Ejercicio 1
  final def GenerarLista(max: Int): List[Int] = {
    max match {
      case 0 => List()
      case _ => max::GenerarLista(max - 1)
    }
  }

}
