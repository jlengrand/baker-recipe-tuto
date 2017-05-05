package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.events.HeatedBasicSoup;
import erwtensoep.ingredients.*;

/**
 * Created by jll on 5/4/2017.
 */
public class SoupPreheating implements JInteraction{

    @ProvidesIngredient("HeatedBasicSoup")
    public HeatedBasicSoup apply(
            @RequiresIngredient("water") Water water,
            @RequiresIngredient("laurier") Laurier laurier,
            @RequiresIngredient("rookspek") RookSpek rookSpek,
            @RequiresIngredient("hamschrijf") Hamschijf hamschijf,
            @RequiresIngredient("zout") Zout zout,
            @RequiresIngredient("pan") Pan pan,
            @RequiresIngredient("lepel") Lepel lepel,
            @RequiresIngredient("gasFournuis") GasFournuis gasFournuis
            ){
        System.out.println("Interaction HeatedBasicSoup");
        return new HeatedBasicSoup();
    }
}