package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ConfigPage;

public class ConfigSteps extends ScenarioSteps {

    ConfigPage configPage;

    @Step()
    public void clickOnDogButton() {
        configPage.clickOnDogButton();
    }

}
