package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.*;

/**
 * Created by jll on 5/5/2017.
 */
public class ChopVegetables implements JInteraction{

    @ProvidesIngredient("choppedVegetables")
    public ChoppedVegetables apply(
            @RequiresIngredient("cuttingBoard") CuttingBoard cuttingBoard,
            @RequiresIngredient("knife") Knife knife,
            @RequiresIngredient("potato") Potato potato,
            @RequiresIngredient("carrot") Carrot carrot
            ){
        System.out.println("Chopping vegetables");
        return new ChoppedVegetables();
    }


}
