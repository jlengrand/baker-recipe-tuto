import java.util.UUID

import com.google.common.collect.ImmutableList
import com.ing.baker.java_api.{JBaker, JCompiledRecipe}
import erwtensoep.PeaSoupRecipeUtils
import erwtensoep.events.{GroceriesDone, KitchenToolsReady}
import erwtensoep.ingredients.Peas
import erwtensoep.interactions.PreheatSoup

/**
  * Created by jll on 5/4/2017.
  */
object ErwtenSoepCooker {
  def main(args: Array[String]): Unit = {

    // Let's create a recipe and validate it
    val recipeCreator = new PeaSoupRecipeUtils
    val recipe = recipeCreator.createRecipe()
    val compiledRecipe = recipe.compileRecipe

    println(compiledRecipe.getRecipeVisualization())
    println("=======")

    //Actual implementation
    val baker = new JBaker(
      recipe,
      recipeCreator.getInteractions
    )

    val id = UUID.randomUUID();
    baker.bake(id)

    //Firing events
    baker.processEvent(id, new KitchenToolsReady())
    baker.processEvent(id, new GroceriesDone())

    // Recipe should be ran now
    val ingredients = baker.getIngredients(id);
    val events = baker.getEvents(id);

    println(ingredients)
    println(events)

    baker.shutdown()
  }
}
