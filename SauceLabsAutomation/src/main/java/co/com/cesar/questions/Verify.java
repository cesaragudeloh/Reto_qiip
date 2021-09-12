package co.com.cesar.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Verify implements Question<Boolean> {

    private Target target;

    public Verify(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static Verify thePurchase(Target target) {
        return Instrumented.instanceOf(Verify.class).withProperties(target);
    }
}
