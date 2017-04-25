package pom;

import framework.Ten10Driver;
import org.openqa.selenium.By;

public class BasePage {
  private static final By LINK_CONTACT_US = By.cssSelector("a[title=\"Contact Us\"]");
  private static final By LINK_SIGN_IN = By.cssSelector("a.login");
  private static final By INPUT_SEARCH_BOX = By.cssSelector("#search_query_top");
  private static final By BUTTON_SEARCH = By.cssSelector("button[type=\"Submit\"]");
  private static final By LINK_SHOPPING_CART = By.cssSelector("a[title=\"View my shopping cart\"]");

  public void clickContactUs() {
    Ten10Driver.getInstance().findElement(LINK_CONTACT_US).click();
  }

  public void clickSignIn() {
    Ten10Driver.getInstance().findElement(LINK_SIGN_IN).click();
  }

  public SearchResultsPage search(String searchTerm) {
    Ten10Driver.getInstance().findElement(INPUT_SEARCH_BOX).sendKeys(searchTerm);
    Ten10Driver.getInstance().findElement(BUTTON_SEARCH).click();

    return new SearchResultsPage();
  }

  public void clickShoppingCart() {
    Ten10Driver.getInstance().findElement(LINK_SHOPPING_CART).click();
  }
}
