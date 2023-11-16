package starter.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static starter.search.SearchForm.CART_ITEMS_NUMBER;

public class ValidateCart implements Question<Boolean> {
    private static final String EXPECTED_NUMBER = "1";

    @Override
    public Boolean answeredBy(Actor actor) {
        String validationText = actor.asksFor(Text.of(CART_ITEMS_NUMBER).asString());
        return validationText.equals(EXPECTED_NUMBER);
    }

    public static ValidateCart theCartCount() {
        return new ValidateCart();
    }
}
