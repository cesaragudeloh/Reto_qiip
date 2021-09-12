package co.com.cesar.stepdefinitions;

import co.com.cesar.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.cesar.utils.Constants.USERNAME;
import static co.com.cesar.utils.Constants.PASSWORD;

public class BuyProductsStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("that {string} sign in SwagLabs app")
    public void thatSignInSwagLabsApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(
                Login.with().username(USERNAME).andPassword(PASSWORD)
        );

    }

    @When("He add the {string} to the cart")
    public void heAddTheToTheCart(String string) {
        System.out.println("When");
    }

    @And("He does the checkout of the purchase")
    public void heDoesTheCheckoutOfThePurchase() {
        System.out.println("And");
    }

    @Then("He should see that the purchase is successful")
    public void heShouldSeeThatThePurchaseIsSuccessful() {
        System.out.println("Then");
    }

}
