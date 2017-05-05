package erwtensoep.recipes;

import com.ing.baker.java_api.JInteractionDescriptor;
import com.ing.baker.java_api.JRecipe;
import erwtensoep.events.BoodschappenGedaan;
import erwtensoep.events.KitchenToolsReady;
import erwtensoep.interactions.SoupPreheating;

/**
 * Created by jll on 5/4/2017.
 */
public final class ErwtenSoepRecipeCreator {

    public JRecipe createRecipe(){
        return new JRecipe("ErwtenSoepRecipe")
                .withInteraction(
                        JInteractionDescriptor.of(SoupPreheating.class))
                .withSensoryEvents(
                        KitchenToolsReady.class,
                        BoodschappenGedaan.class
                )
                ;
    }

}
