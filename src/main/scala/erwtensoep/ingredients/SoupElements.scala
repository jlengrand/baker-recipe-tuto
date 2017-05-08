package erwtensoep.ingredients

import com.ing.baker.api.Ingredient

/**
  * Created by jll on 5/5/2017.
  */
class SoupElements

class ChoppedVegetables extends Ingredient
class HeatedBasicSoup extends Ingredient{
  val boiledHamschrijf = new BoiledHam();
  val boiledRookSpek = new BoiledBacon();
  val broth = new Broth();
}

class BoiledHam extends Ingredient
class BoiledBacon extends Ingredient
class Broth extends Ingredient
class ChoppedMeat extends Ingredient

class DutchPeaSoup extends Ingredient
class PeaSoupWithSmokedSausage extends Ingredient