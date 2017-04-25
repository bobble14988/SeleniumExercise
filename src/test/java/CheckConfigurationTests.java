import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckConfigurationTests {

  @Test
  public void checkConfig() {
    WebDriver driver = new FirefoxDriver();

    driver.get("http://www.ten10.com");

    Assert.assertEquals("Homepage - Ten10", driver.getTitle());

    driver.quit();
  }
}
