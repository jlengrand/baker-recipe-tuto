import java.util.UUID

import akka.actor.ActorSystem
import com.ing.baker.core.Baker
import com.ing.baker.java_api.JBaker
import com.ing.baker.scala_api.{InteractionDescriptorFactory, SRecipe}
import erwtensoep.events.{GroceriesDone, KitchenToolsReady}
import erwtensoep.interactions._

import scala.concurrent.duration.FiniteDuration

/**
  * Created by jll on 5/4/2017.
  */
object ErwtenSoepCooker {
  implicit val timeout: FiniteDuration = new FiniteDuration(10, java.util.concurrent.TimeUnit.SECONDS)
  def main(args: Array[String]): Unit = {

    // Let's create a recipe and validate it
    val recipe = new SRecipe(
      "ErwtenSoepRecipe",
      Seq(),
      Seq(InteractionDescriptorFactory[PreheatSoup](),
        InteractionDescriptorFactory[ChopVegetables](),
        InteractionDescriptorFactory[CutBoiledMeat](),
        InteractionDescriptorFactory[CombineDutchPeaSoup](),
        InteractionDescriptorFactory[AddSmokedSausage]()
      ),
      Set(classOf[KitchenToolsReady], classOf[GroceriesDone])
    )

    val compiledRecipe = recipe.compileRecipe

    println(compiledRecipe.getRecipeVisualization)
    println("=======")

    //Actual implementation
    val baker = new Baker(
      recipe,
      implementations = Map(
        classOf[PreheatSoup] -> (() => new PreheatSoup()),
        classOf[ChopVegetables] -> (() => new ChopVegetables()),
        classOf[CutBoiledMeat] -> (() => new CutBoiledMeat()),
        classOf[CombineDutchPeaSoup] -> (() => new CombineDutchPeaSoup()),
        classOf[AddSmokedSausage] -> (() => new AddSmokedSausage())
      ),
      actorSystem = ActorSystem.apply("BakerActorSystem", JBaker.defaultConfig)
    )

    val id = UUID.randomUUID();
    baker.bake(id)

    //Firing events
    baker.handleEvent(id, new KitchenToolsReady())
    baker.handleEvent(id, new GroceriesDone())

    baker.shutdown()
  }
}
