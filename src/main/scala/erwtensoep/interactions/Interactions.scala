package erwtensoep.interactions

import com.ing.baker.core.Interaction
import com.ing.baker.java_api.{FiresEvent, ProvidesIngredient, RequiresIngredient}
import erwtensoep.events.Cooked5MinutesEvent
import erwtensoep.ingredients._

class AddSmokedSausage extends Interaction{

  @FiresEvent(oneOf = Array(classOf[Cooked5MinutesEvent]))
  def apply(
           @RequiresIngredient("smokedSausage") smokedSausage : SmokedSausage,
           @RequiresIngredient("ErwtenSoep") erwtenSoep : DutchPeaSoup
           ) = {
      println("Adding sausage")
      new Cooked5MinutesEvent()
  }
}

class PreheatSoup extends Interaction{

  @ProvidesIngredient("heatedBasicSoup")
  def apply(
             @RequiresIngredient("bacon") bacon: Bacon,
             @RequiresIngredient("ham") ham: Ham,
             @RequiresIngredient("pan") pan: Pan,
             @RequiresIngredient("spoon") spoon: Spoon,
             @RequiresIngredient("furnace") furnace: Furnace)
  = {
    println("Heating Basic Soup ingredients")
    new HeatedBasicSoup()
  }
}

class CombineDutchPeaSoup extends Interaction{

  @ProvidesIngredient("ErwtenSoep")
  def apply(
             @RequiresIngredient("choppedMeat") choppedMeat: ChoppedMeat,
             @RequiresIngredient("choppedVegetables") choppedVegetables: ChoppedVegetables,
             @RequiresIngredient("heatedBasicSoup") heatedBasicSoup: HeatedBasicSoup,
             @RequiresIngredient("spoon") spoon: Spoon)
    = {
    println("Mixing all ingredients together")
    new DutchPeaSoup
  }
}

class CutBoiledMeat extends Interaction {
  @ProvidesIngredient("choppedMeat")
  def apply(
             @RequiresIngredient("cuttingBoard") cuttingBoard: CuttingBoard,
             @RequiresIngredient("knife") knife: Knife,
             @RequiresIngredient("heatedBasicSoup") heatedBasicSoup: HeatedBasicSoup)
   = {
    println("Chopping boiled meat")
    new ChoppedMeat
  }
}

class ChopVegetables extends Interaction {
  @ProvidesIngredient("choppedVegetables")
  def apply(
             @RequiresIngredient("cuttingBoard") cuttingBoard: CuttingBoard,
             @RequiresIngredient("knife") knife: Knife,
             @RequiresIngredient("potato") potato: Potato,
             @RequiresIngredient("carrot") carrot: Carrot)
  = {
    println("Chopping vegetables")
    new ChoppedVegetables
  }
}