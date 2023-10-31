package StepDefs;

import Pages.CreateAccountPage;
import Util.SeleniumUtility;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountSteps extends SeleniumUtility {


    @Given("clicking create primary account button")
    public void clicking_create_primary_account_button() {
      click(CreateAccountPage.createPrimaryAccountButton);
    }
    @When("filling out the form with valid email")
    public void filling_out_the_form_with_valid_email() throws InterruptedException {
       sendText(CreateAccountPage.emailAddressLocator,"elonmask@Tesla.com");
        Thread.sleep(4000);
        click(CreateAccountPage.titleLocator);
        WebElement titleElement = getDriver().findElement(By.id("title"));
       Select select = new Select(titleElement);
       select.selectByVisibleText("Mr.");
       Thread.sleep(4000);
    }
    @When("clicking the create account button")
    public void clicking_the_create_account_button() {
        System.out.println(1);
    }
    @Then("user should see the email address they used when creating the account")
    public void user_should_see_the_email_address_they_used_when_creating_the_account() {
        System.out.println(1);
    }


}
