package com.syntax.class27Interface;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new Chromedriver();
        webDriver.closeBrowser();
        webDriver.findElement();
        webDriver.maximizeWindow();
        webDriver.openBrowser();

        WebDriver[]webDrivers={new Chromedriver(),new FireFoxDriver()};{
            for (WebDriver w:webDrivers
                 ) {
               w.openBrowser();
               w.maximizeWindow();
               w.findElement();
               w.closeBrowser();
            }
        }
    }
}
