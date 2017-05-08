package erwtensoep.events

import com.ing.baker.api.Event
import erwtensoep.ingredients._

/**
  * Created by jll on 5/4/2017.
  */
class GroceriesDone extends Event {
  val potato= new Potato
  val carrot = new Carrot
  val bacon = new Bacon
  val ham = new Ham
  val peas = new Peas
  val smokedSausage = new SmokedSausage
}
