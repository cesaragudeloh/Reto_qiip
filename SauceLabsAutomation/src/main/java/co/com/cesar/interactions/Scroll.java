package co.com.cesar.interactions;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll {

    private Scroll(){
        throw new IllegalStateException("class not instantiable");
    }

    public static Performable untilVisibleTarget(Target target) {
        return Tasks.instrumented(ScrollVisible.class, new Object[]{target});
    }

}
