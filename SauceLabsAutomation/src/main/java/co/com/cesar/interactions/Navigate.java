package co.com.cesar.interactions;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class Navigate {

    private Navigate(){
        throw new IllegalStateException("class not instantiable");
    }

    public static Performable untilVisibleTarget(Target target) {
        return Tasks.instrumented(TargetVisible.class, new Object[]{target});
    }

}
