package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.ChoppedMeat;
import erwtensoep.ingredients.HeatedBasicSoup;
import erwtensoep.ingredients.Knife;
import erwtensoep.ingredients.CuttingBoard;

/**
 * Created by jll on 5/5/2017.
 */
public class CutBoiledMeat implements JInteraction {

    @ProvidesIngredient("ChoppedMeat")
    public ChoppedMeat apply(
            @RequiresIngredient("cuttingBoard") CuttingBoard cuttingBoard,
            @RequiresIngredient("knife") Knife knife,
            @RequiresIngredient("HeatedBasicSoup")HeatedBasicSoup heatedBasicSoup
            ){
        System.out.println("Chopping boiled meat");
        return new ChoppedMeat();
    }
}
