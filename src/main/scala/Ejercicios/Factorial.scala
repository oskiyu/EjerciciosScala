package Ejercicios

object Factorial {

  final def main(args: Array[String]): Unit ={
    println(Factorial(5))
  }

  final def Factorial(x: Int): Int = {
    x match {
      case x if x < 0 => throw new Exception("XD")

      case 0 => 1
      case 1 => 1

      case _ => x * Factorial(x - 1)
    }
  }

}
