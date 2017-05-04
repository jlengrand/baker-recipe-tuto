import erwtensoep.events.KitchenToolsReady
import erwtensoep.ingredients.SplitErwten

/**
  * Created by jll on 5/4/2017.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val test = new SplitErwten();
    println(test.toString)

    val testEvent = new KitchenToolsReady
    println(testEvent.pan)
  }
}
