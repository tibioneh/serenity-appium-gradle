package pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {

  public void clickButton(String id) {
    By by = AppiumBy.accessibilityId(id);
    clickButton(by);
  }

  public void clickButton(By by) {
    WebElement button = getDriver().findElement(by);
    button.click();
  }

  public void clickButtonByXpath(String xpath) {
    WebElement button = getDriver().findElement(By.xpath(xpath));
    button.click();
  }

  public SearchContext getShadowRoot (WebElement element) {
    SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) getDriver ()).executeScript (
            "return arguments[0].shadowRoot", element);
    return shadowRoot;
  }

  public SearchContext getShadowRoot (By by) {
    WebElement shadowHost = getDriver().findElement(by);
    SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) getDriver ()).executeScript (
            "return arguments[0].shadowRoot", shadowHost);
    return shadowRoot;
  }

}
