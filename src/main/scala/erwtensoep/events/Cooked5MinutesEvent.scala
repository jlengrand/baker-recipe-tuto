package erwtensoep.events

import com.ing.baker.api.Event
import erwtensoep.ingredients.PeaSoupWithSmokedSausage

/**
  * Created by jll on 5/8/2017.
  */
class Cooked5MinutesEvent extends Event{

  val erwtenSoepMetRookWorst = new PeaSoupWithSmokedSausage()
}
