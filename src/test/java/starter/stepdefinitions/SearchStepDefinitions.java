package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.navigation.NavigateTo;
import starter.questions.ValidateCart;
import starter.search.LookForInformation;
import static starter.search.SearchForm.*;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on amazon")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                Enter.theValue(term).into(SEARCH_FIELD).thenHit(Keys.RETURN)
        );

    }

    @And("{actor} clicks first item")
    public void clickFirstItem(Actor actor) {
        actor.attemptsTo(
                Click.on(ITEM_LIST));
    }

    @And("{actor} clicks add cart btn")
    public void clickAddCartBtn(Actor actor) {
        actor.attemptsTo(Click.on(ADD_TO_CART_BUTTON));
    }

    @Then("{actor} should cart count go to 1")
    public void cartIconGoOne(Actor actor) {
        actor.should(seeThat(ValidateCart.theCartCount(), equalTo(true)));
    }
}
