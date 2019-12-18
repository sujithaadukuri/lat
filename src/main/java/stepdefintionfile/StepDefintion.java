package stepdefintionfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.SignupPage;

public class StepDefintion {
    WebDriver driver;
    SignupPage signin;
    public StepDefintion(){
        driver= Drivers.getinst("ie");
    }

    @Given("^user enters the url of the browser$")
    public void user_enters_the_url_of_the_browser() throws Throwable {
        signin.login();

    }

    @Then("^amazon homepage will be displayed$")
    public void amazon_homepage_will_be_displayed() throws Throwable {

        //driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a[2]")).click();
        /*Select dropdown=new Select(dropdownelem);
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
        String parent=driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String child=it.next();
            driver.switchTo().window(child);
            driver.findElement(By.cssSelector("//input[@type='email'][@name='email']")).sendKeys("9642289303");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.cssSelector("//input[@type='password'][@name='password']")).sendKeys("sujitha@37");
            driver.findElement(By.cssSelector("//input[@type='checkbox'][@value='true']")).isSelected();
            driver.findElement(By.id("signInSubmit")).click();
        }
*/
    }

    @When("^user enters the login credentials and click on login button$")
    public void user_enters_the_login_credentials_and_click_on_login_button() throws Throwable {

    }

    @Then("^user account should be signed in$")
    public void user_account_should_be_signed_in() throws Throwable {

    }

    @Given("^user click on category menu$")
    public void user_click_on_category_menu() throws Throwable {

    }

    @When("^user select the women fashion submenu$")
    public void user_select_the_women_fashion_submenu() throws Throwable {

    }

    @When("^Western menu in women fashion$")
    public void western_menu_in_women_fashion() throws Throwable {

    }

    @Then("^western wear page should be displayed$")
    public void western_wear_page_should_be_displayed() throws Throwable {

    }

    @When("^user select top brands check box$")
    public void user_select_top_brands_check_box() throws Throwable {

    }

    @Then("^user select a product and add to cart$")
    public void user_select_a_product_and_add_to_cart() throws Throwable {

    }

    @Then("^user goes to cart page$")
    public void user_goes_to_cart_page() throws Throwable {

    }

    @When("^clicking on delete button$")
    public void clicking_on_delete_button() throws Throwable {

    }

    @Then("^product should be removed from the cart$")
    public void product_should_be_removed_from_the_cart() throws Throwable {

    }

    @When("^user click on account dropdown and click on sign in button$")
    public void user_click_on_account_dropdown_and_click_on_sign_in_button() throws Throwable {

    }

    @Then("^user should sign out from amazon$")
    public void user_should_sign_out_from_amazon() throws Throwable {

    }
}
