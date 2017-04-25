package pom;

import framework.Ten10Driver;
import org.openqa.selenium.By;

public class SearchResultsPage extends BasePage {

  private static final String SEARCH_RESULT_PARAM = "ul.product_list > li:nth-of-type(%s) a.product-name";

  public String getNameOfSearchResult(int resultId) {
    By searchResultName = By.cssSelector(String.format(SEARCH_RESULT_PARAM, Integer.toString(resultId)));

    return Ten10Driver.getInstance().findElement(searchResultName).getText();
  }
}
