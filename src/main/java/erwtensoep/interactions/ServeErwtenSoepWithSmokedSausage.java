package erwtensoep.interactions;

import com.ing.baker.java_api.JInteraction;
import com.ing.baker.java_api.ProvidesIngredient;
import com.ing.baker.java_api.RequiresIngredient;
import erwtensoep.ingredients.ErwtenSoep;
import erwtensoep.ingredients.ErwtenSoepMetRookWorst;
import erwtensoep.ingredients.RookWorst;

/**
 * Created by jll on 5/8/2017.
 */
public class ServeErwtenSoepWithSmokedSausage implements JInteraction {

    @ProvidesIngredient("ErwtenSoepMetRookWorst")
    public ErwtenSoepMetRookWorst apply(
    ){
        System.out.println("Finished cooking 5 minutes. Ready to serve!");
        return new ErwtenSoepMetRookWorst();
    }
}
