package com.belgenet.step_definitions;

import com.belgenet.pages.LoginPage;
import com.belgenet.utilities.ConfigurationReader;
import com.belgenet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
    LoginPage loginPage=new LoginPage();


    @Given("Kullanıcı login sayfasına gider.")
    public void kullanıcıLoginSayfasınaGider() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Kullanıcı geçerli verilerle login olmalıdır.")
    public void kullanıcıGeçerliVerilerleLoginOlmalıdır() {
        loginPage.loginUser();

    }


    @Then("Kullanıcı login olduğunda {string} tabini gördüğünü verify eder.")
    public void kullanıcıLoginOlduğundaTabiniGördüğünüVerifyEder(String tabName) {
        loginPage.verifyLogin_Mtd(tabName);
    }
}

