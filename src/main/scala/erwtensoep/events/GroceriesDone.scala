package erwtensoep.events

import com.ing.baker.api.Event
import erwtensoep.ingredients._

/**
  * Created by jll on 5/4/2017.
  */
class GroceriesDone extends Event {
  val zout = new Zout
  val laurier = new Laurier
  val prei = new Prei
  val aardappel= new Aardappel
  val winterwortel = new WinterWortel
  val knolselderij = new KnolSelderij
  val water = new Water
  val rookspek = new RookSpek
  val hamschrijf = new Hamschijf
  val spliterwten = new SplitErwten
  val rookWorst = new RookWorst
}
