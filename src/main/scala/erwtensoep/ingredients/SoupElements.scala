package erwtensoep.ingredients

import com.ing.baker.api.Ingredient

/**
  * Created by jll on 5/5/2017.
  */
class SoupElements

class ChoppedVegetables extends Ingredient
class HeatedBasicSoup extends Ingredient{
  val boiledHamschrijf = new BoiledHamSchrijf();
  val boiledRookSpek = new BoiledRookSpek();
  val broth = new Broth();
}

class BoiledHamSchrijf extends Ingredient
class BoiledRookSpek extends Ingredient
class Broth extends Ingredient
class ChoppedMeat extends Ingredient

class ErwtenSoep extends Ingredient
class ErwtenSoepMetRookWorst extends Ingredient
class CookedErwtenSoepMetRookWorst extends Ingredient