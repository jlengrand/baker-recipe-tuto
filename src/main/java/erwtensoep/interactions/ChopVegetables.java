package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.*;

/**
 * Created by jll on 5/5/2017.
 */
public class ChopVegetables implements JInteraction{

    @ProvidesIngredient("ChoppedVegetables")
    public ChoppedVegetables apply(
            @RequiresIngredient("snijPlank")SnijPlank snijPlank,
            @RequiresIngredient("mes")Mes mes,
            @RequiresIngredient("prei")Prei prei,
            @RequiresIngredient("aardappel")Aardappel aardappel,
            @RequiresIngredient("winterwortel")WinterWortel winterwortel,
            @RequiresIngredient("knolselderij")KnolSelderij knolSelderij
            ){
        System.out.println("Chopping vegetables");
        return new ChoppedVegetables();
    }


}
