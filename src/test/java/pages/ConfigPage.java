package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class ConfigPage extends BasePage {

  public void clickOnDogButton() {
    String s = System.getProperty("aaa");
    System.out.println("custom property--->>>" + s);

    // working with shadow dom
    SearchContext shadowRoot = getShadowRoot(By.cssSelector("body app-root"));
    WebElement dogButton = shadowRoot.findElements(By.cssSelector("nav-bar > a")).get(1);
    dogButton.click();

    // going one lever deeper in the shadow dom
    SearchContext shadowRoot2 =
        getShadowRoot(shadowRoot.findElement(By.cssSelector("app-home-route")));
    WebElement paragraph = shadowRoot2.findElement(By.cssSelector("p"));
    System.out.println("paragraph--->>>" + paragraph.getText());
    paragraph.click();
    waitABit(3000);

    WebElement catButton = shadowRoot.findElements(By.cssSelector("nav-bar > a")).get(2);
    catButton.click();

    waitABit(3000);
  }
}
