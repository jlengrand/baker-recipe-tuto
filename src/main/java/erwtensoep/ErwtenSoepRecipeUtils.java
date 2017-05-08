package erwtensoep;

import com.google.common.collect.ImmutableList;
import com.ing.baker.core.Interaction;
import com.ing.baker.java_api.JInteractionDescriptor;
import com.ing.baker.java_api.JRecipe;
import erwtensoep.events.BoodschappenGedaan;
import erwtensoep.events.Cooked5MinutesEvent;
import erwtensoep.events.KitchenToolsReady;
import erwtensoep.interactions.*;

import java.util.List;

/**
 * Note : Those are methods that are created in Java to save some time
 * The class should be removed and replaced by scala implementations instead
 * Created by jll on 5/4/2017.
 */
public final class ErwtenSoepRecipeUtils {

    public JRecipe createRecipe(){
        return new JRecipe("ErwtenSoepRecipe")
                .withInteractions(
                        JInteractionDescriptor.of(PreheatSoup.class),
                        JInteractionDescriptor.of(ChopVegetables.class),
                        JInteractionDescriptor.of(CutBoiledMeat.class),
                        JInteractionDescriptor.of(CombineErwtenSoep.class),
                        JInteractionDescriptor.of(AddRookWorst.class))
                .withSensoryEvents(
                        KitchenToolsReady.class,
                        BoodschappenGedaan.class);
    }

    public List<Interaction> getInteractions(){
        return ImmutableList.<Interaction>of(
                new PreheatSoup(),
                new ChopVegetables(),
                new CutBoiledMeat(),
                new CombineErwtenSoep(),
                new AddRookWorst()
        );
    }
}
