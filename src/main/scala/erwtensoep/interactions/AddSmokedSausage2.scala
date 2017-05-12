package erwtensoep.interactions

import com.ing.baker.core.Interaction
import com.ing.baker.java_api.RequiresIngredient
import erwtensoep.events.Cooked5MinutesEvent
import erwtensoep.ingredients.{DutchPeaSoup, SmokedSausage}
/**
  * Created by jll on 5/11/2017.
  */
trait AddSmokedSausage2 extends Interaction{

  def apply(
           @RequiresIngredient("smokedSausage") smokedSausage : SmokedSausage,
           @RequiresIngredient("ErwtenSoep") erwtenSoep : DutchPeaSoup
           ) : Cooked5MinutesEvent ={
      println("Adding sausage")
      new Cooked5MinutesEvent()
  }
}
