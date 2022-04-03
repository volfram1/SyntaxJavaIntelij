package com.syntax.class27Interface;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class Chromedriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("max chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("finding element in chrome");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("max firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("finding element in firefox");
    }
}
