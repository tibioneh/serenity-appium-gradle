package tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import steps.ConfigSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class SomeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    ConfigSteps configSteps;

    @Test
    @Tag("alpha")
    public void someTest() {
        configSteps.clickOnDogButton();
    }

}
