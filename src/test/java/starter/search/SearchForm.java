package starter.search;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.targets.Target.the;


public class SearchForm {
    //public static final Target SEARCH_FIELD = InputField.withNameOrId("twotabsearchtextbox");

    public static final Target SEARCH_FIELD = the("Search input")
            .locatedBy("//*[@id='twotabsearchtextbox']");
    public static final Target ITEM_LIST = the("First item list")
            .locatedBy("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a");
    public static final Target ADD_TO_CART_BUTTON = the("Add to cart button")
            .locatedBy("//*[@id='add-to-cart-button']");
    public static final Target CART_ITEMS_NUMBER = the("Number of item in cart")
            .locatedBy("//*[@id='nav-cart-count']");


}
