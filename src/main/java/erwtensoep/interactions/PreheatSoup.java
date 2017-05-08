package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.*;

/**
 * Created by jll on 5/4/2017.
 */
public class PreheatSoup implements JInteraction{

    @ProvidesIngredient("heatedBasicSoup")
    public HeatedBasicSoup apply(
            @RequiresIngredient("bacon") Bacon bacon,
            @RequiresIngredient("ham") Ham ham,
            @RequiresIngredient("pan") Pan pan,
            @RequiresIngredient("spoon") Spoon spoon,
            @RequiresIngredient("furnace") Furnace furnace
            ){
        System.out.println("Heating Basic Soup ingredients");
        return new HeatedBasicSoup();
    }
}
