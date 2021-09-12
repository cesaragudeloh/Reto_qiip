package co.com.cesar.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyProductsStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        System.out.println("Before");
    }


    @Given("that {string} sign in SwagLabs app")
    public void thatSignInSwagLabsApp(String string) {
        System.out.println("Given");
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
