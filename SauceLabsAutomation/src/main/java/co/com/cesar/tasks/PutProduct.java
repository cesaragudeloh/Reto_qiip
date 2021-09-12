package co.com.cesar.tasks;

import co.com.cesar.interactions.Scroll;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cesar.userinterface.StorePage.PRODUCT_NAME;
import static co.com.cesar.userinterface.ProductDetailsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PutProduct implements Task {

    private String productName;

    public PutProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.untilVisibleTarget(PRODUCT_NAME.of(productName)),
                Click.on(PRODUCT_NAME.of(productName)),
                Scroll.untilVisibleTarget(ADD_TO_CART_BUTTON),
                Click.on(ADD_TO_CART_BUTTON)
        );
    }

    public static PutProduct inTheCart(String productName) {
        return Instrumented.instanceOf(PutProduct.class).withProperties(productName);
    }
}
