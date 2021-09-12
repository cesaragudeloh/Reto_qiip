package co.com.cesar.tasks;

import co.com.cesar.interactions.Navigate;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cesar.userinterface.StorePage.PRODUCT_NAME;
import static co.com.cesar.userinterface.ProductDetailsPage.*;

public class PutProduct implements Task {

    private String productName;

    public PutProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Navigate.untilVisibleTarget(PRODUCT_NAME.of(productName)),
                Click.on(PRODUCT_NAME.of(productName)),
                Navigate.untilVisibleTarget(ADD_TO_CART_BUTTON),
                Click.on(ADD_TO_CART_BUTTON)
        );
    }

    public static PutProduct inTheCart(String productName) {
        return Instrumented.instanceOf(PutProduct.class).withProperties(productName);
    }
}
