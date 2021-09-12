package co.com.cesar.stepdefinitions;

import co.com.cesar.tasks.Checkout;
import co.com.cesar.tasks.Login;
import co.com.cesar.tasks.PutProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.cesar.utils.Constants.*;
import static co.com.cesar.userinterface.CheckoutComplete.*;

public class BuyProductsStepDefinitions {


    @Given("that {string} sign in SwagLabs app")
    public void thatSignInSwagLabsApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(
                Login.with().username(USERNAME).andPassword(PASSWORD)
        );

    }

    @When("He add the {string} to the cart")
    public void heAddTheToTheCart(String productName) {
        theActorInTheSpotlight().attemptsTo(
                PutProduct.inTheCart(productName)
        );
    }

    @And("He does the checkout of the purchase")
    public void heDoesTheCheckoutOfThePurchase() {
        theActorInTheSpotlight().attemptsTo(
                Checkout.thePurchase()
        );
    }

    @Then("He should see that the purchase is successful")
    public void heShouldSeeThatThePurchaseIsSuccessful() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CHECKOUT_COMPLETE.of(CHECKOUT_COMPLETE_TITLE)).isDisplayed(),
                Ensure.that(CHECKOUT_COMPLETE.of(THANKS_ORDER_LABEL)).isDisplayed(),
                Ensure.that(CHECKOUT_COMPLETE.of(DETAIL_ORDER_LABEL)).isDisplayed()
        );
    }

}
