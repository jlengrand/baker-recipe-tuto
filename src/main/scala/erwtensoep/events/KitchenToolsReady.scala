package erwtensoep.events

import com.ing.baker.api.Event
import erwtensoep.ingredients._

/**
  * Created by jll on 5/4/2017.
  */
class KitchenToolsReady extends Event{
  val pan = new Pan
  val knife = new Knife
  val spoon = new Spoon
  val furnace = new Furnace
  val cuttingBoard = new CuttingBoard
}
