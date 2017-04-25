package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ten10Driver {

  private static WebDriver driver = null;

  public static WebDriver getInstance() {
    if (driver == null) {
      driver = new FirefoxDriver();
    }

    return driver;
  }
}
