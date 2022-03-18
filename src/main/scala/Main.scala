import java.util

object Main {

  def EsGay(persona: String): Boolean = {
    persona match {
      case "moha" => true
      case "martilux" => true
      case "charli" => true

      case _ => false
    }
  }

  final def main(args: Array[String]) {
    val nombres: List[String] = List("moha", "martilux", "charli", "oskiyu")
    for (x: String <- nombres if EsGay(x))
      println(x + " es gay")
    for (x: String <- nombres if !EsGay(x))
      println(x + " no es gay")
  }
}
