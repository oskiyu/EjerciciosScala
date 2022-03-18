final def Length[T](lista: List[T]): Int = {
  if (lista.isEmpty) 0
  else 1 + Length(lista.tail)
}

def Resta(x: Int, y: Int): Int = x - y
val CincoMenos = Resta(5,_: Int)

val resta = CincoMenos(2)
val longitud = Length(List(0, 0, 0, 0, 0))
