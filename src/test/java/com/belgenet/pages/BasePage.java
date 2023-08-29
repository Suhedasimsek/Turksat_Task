package com.belgenet.pages;



import com.belgenet.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public  abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }

    public static void scrolldownWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


}


