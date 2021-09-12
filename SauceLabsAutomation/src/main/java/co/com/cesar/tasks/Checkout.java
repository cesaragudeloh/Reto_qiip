package co.com.cesar.tasks;

import co.com.cesar.interactions.Scroll;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.cesar.userinterface.StorePage.SHOP_CART_BUTTON;
import static co.com.cesar.userinterface.CartPage.*;
import static co.com.cesar.userinterface.CheckoutPage.*;
import static co.com.cesar.utils.Constants.*;

public class Checkout implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHOP_CART_BUTTON),
                Click.on(CHECKOUT_BUTTON),
                Enter.theValue(FISTNAME_VALUE).into(FIRST_NAME_INPUT),
                Enter.theValue(LASTNAME_VALUE).into(LAST_NAME_INPUT),
                Enter.theValue(POSTALCODE_VALUE).into(POSTAL_CODE_INPUT),
                Click.on(CONTINUE_BUTTON),
                Scroll.untilVisibleTarget(FINISH_BUTTON),
                Click.on(FINISH_BUTTON)
        );
    }

    public static Checkout thePurchase() {
        return Instrumented.instanceOf(Checkout.class).withProperties();
    }
}
