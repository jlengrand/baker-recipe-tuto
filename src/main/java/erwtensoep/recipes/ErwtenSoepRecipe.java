package erwtensoep.recipes;

import com.ing.baker.compiler.Recipe;
import com.ing.baker.core.InteractionDescriptor;
import com.ing.baker.core.InteractionFailureStrategy;
import scala.collection.Seq;
import scala.collection.immutable.Set;

/**
 * Created by jll on 5/4/2017.
 */
public class ErwtenSoepRecipe implements Recipe {
    @Override
    public String name() {
        return "ErwtenSoepRecipe";
    }

    @Override
    public Seq<InteractionDescriptor<?>> interactionDescriptors() {
        return null;
    }

    @Override
    public Seq<InteractionDescriptor<?>> sieveDescriptors() {
        return null;
    }

    @Override
    public Set<Class<?>> events() {
        return null;
    }

    @Override
    public InteractionFailureStrategy defaultFailureStrategy() {
        return null;
    }
}
