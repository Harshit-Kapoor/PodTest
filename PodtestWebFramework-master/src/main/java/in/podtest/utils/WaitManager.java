package in.podtest.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

/*
-------------------------
Created By: Akhil Jain
Owner: PodTest.in
Website: https://podtest.in
Email Address: akhil.jain@podtest.in
-------------------------
 */
public class WaitManager {

    /*
-------------------------
Created By: Akhil Jain
Owner: PodTest.in
Website: https://podtest.in
Email Address: akhil.jain@podtest.in
-------------------------
*/
    public static void setImplicitWait(WebDriver wd) {
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    /*
-------------------------
Created By: Akhil Jain
Owner: PodTest.in
Website: https://podtest.in
Email Address: akhil.jain@podtest.in
-------------------------
 */
    public static void setExplicitWait(WebDriver wd, WebElement e1) {
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(e1));
    }

    public static void setExplicitWait(WebDriver wd, ExpectedCondition ec) {
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
        wait.until(ec);
    }

    /*
    -------------------------
    Created By: Akhil Jain
    Owner: PodTest.in
    Website: https://podtest.in
    Email Address: akhil.jain@podtest.in
    -------------------------
     */
    public static void setFluentWait(WebDriver wd, By locator) {
        Wait fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));


        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
