package com.belgenet.pages;


import com.belgenet.utilities.ConfigurationReader;
import com.belgenet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(id = "parolaSertifikaAccordion:uForm:txtUKullaniciAdi")
    public WebElement userNameInput_loc;

    @FindBy(id = "loginUSifre")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton_loc;

    @FindBy(partialLinkText = "Demo")
    public WebElement demo_loc;
     @FindBy(xpath = "//span[text()='Menü']")
    public WebElement menu_loc;


    public void loginUser() {

        demo_loc.click();
        userNameInput_loc.sendKeys(ConfigurationReader.get("username"));
        passwordInput_loc.sendKeys(ConfigurationReader.get("password"));
        submitButton_loc.click();

    }
    public void verifyLogin_Mtd() throws InterruptedException {
  //  waitFor(2);
    String actual = menu_loc.getText();
    String expected = "Menü";
        Assert.assertEquals(expected,actual);
    }

}