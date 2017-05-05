import com.ing.baker.java_api.JCompiledRecipe
import erwtensoep.events.KitchenToolsReady
import erwtensoep.ingredients.SplitErwten
import erwtensoep.recipes.{ErwtenSoepRecipe, ErwtenSoepRecipeCreator}

/**
  * Created by jll on 5/4/2017.
  */
object ErwtenSoepCooker {
  def main(args: Array[String]): Unit = {

    // Let's create a recipe and validate it
    val recipeCreator = new ErwtenSoepRecipeCreator
    val recipe = recipeCreator.createRecipe()
    val compiledRecipe = recipe.compileRecipe

    println(compiledRecipe.getRecipeVisualization())
  }
}
