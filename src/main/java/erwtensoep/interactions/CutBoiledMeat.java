package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.ChoppedMeat;
import erwtensoep.ingredients.HeatedBasicSoup;
import erwtensoep.ingredients.Mes;
import erwtensoep.ingredients.SnijPlank;

/**
 * Created by jll on 5/5/2017.
 */
public class CutBoiledMeat implements JInteraction {

    @ProvidesIngredient("ChoppedMeat")
    public ChoppedMeat apply(
            @RequiresIngredient("snijPlank")SnijPlank snijPlank,
            @RequiresIngredient("mes")Mes mes,
            @RequiresIngredient("HeatedBasicSoup")HeatedBasicSoup heatedBasicSoup
            ){
        System.out.println("Chopping boiled meat");
        return new ChoppedMeat();
    }
}
