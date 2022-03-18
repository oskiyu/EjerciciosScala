package Ejemplos

object Listas {

  /** * Las listas son inmutables. */
  val lista: List[String] = List("a", "b", "c")
  val lista_vacia: List[Any] = List()

  def ConcadenarListas[T](lista1: List[T], lista2: List[T]): List[T] = {
    lista1:::lista2
  }

  def ConcadenarElemento[T](lista: List[T], elem: T): List[T] = {
    elem::lista
  }

  def PrimerElemento[T](lista: List[T]): T = {
    lista.head
  }

  def Resto[T](lista: List[T]): List[T] = {
    lista.tail
  }

}
