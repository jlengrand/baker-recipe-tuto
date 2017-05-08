package erwtensoep.interactions;

import com.ing.baker.java_api.FiresEvent;
import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.events.Cooked5MinutesEvent;
import erwtensoep.ingredients.ErwtenSoep;
import erwtensoep.ingredients.ErwtenSoepMetRookWorst;
import erwtensoep.ingredients.RookWorst;

/**
 * Created by jll on 5/5/2017.
 */
public class AddRookWorst implements JInteraction{

    @FiresEvent(oneOf = Cooked5MinutesEvent.class)
    public Cooked5MinutesEvent apply(
            @RequiresIngredient("rookWorst")RookWorst rookWorst,
            @RequiresIngredient("ErwtenSoep")ErwtenSoep erwtenSoep
            ){
        System.out.println("Adding sausage");
        return new Cooked5MinutesEvent();
    }

}
