package com.syntax.class25Polymorphism;

public class BrowserTester {
    public static void main(String[] args) {
        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openBrowser();
        googleChrome.openBrowser();
        googleChrome.loadPage("hjgvjvjh");
        googleChrome.testPage();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.openBrowser();
        safari.loadPage("jhsdbjsbc");
        safari.testPage();
        safari.closeBrowser();


        Browser[] browser={new Firefox(),new GoogleChrome(), new Safari()};
        for (Browser a:browser) {
            a.openBrowser();
            a.loadPage("hvjhvh");
            a.testPage();
            a.closeBrowser();
        }
    }
}
