package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.*;

/**
 * Created by jll on 5/5/2017.
 */
public class CombineDutchPeaSoup implements JInteraction{

    @ProvidesIngredient("ErwtenSoep")
    public DutchPeaSoup apply(
            @RequiresIngredient("choppedMeat")ChoppedMeat choppedMeat,
            @RequiresIngredient("choppedVegetables")ChoppedVegetables choppedVegetables,
            @RequiresIngredient("heatedBasicSoup")HeatedBasicSoup heatedBasicSoup,
            @RequiresIngredient("spoon") Spoon spoon
            ){
        System.out.println("Mixing all ingredients together");
        return new DutchPeaSoup();
    }

}
