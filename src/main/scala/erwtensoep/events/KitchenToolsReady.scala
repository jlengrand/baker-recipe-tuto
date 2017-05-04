package erwtensoep.events

import com.ing.baker.api.Event
import erwtensoep.ingredients._

/**
  * Created by jll on 5/4/2017.
  */
class KitchenToolsReady extends Event{
  val pan = new Pan
  val mes = new Mes
  val lepel = new Lepel
  val gasFournuis = new GasFournuis
  val snijPlank = new SnijPlank

}
