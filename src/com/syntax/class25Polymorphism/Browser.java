package com.syntax.class25Polymorphism;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the page"+websiteLink);
    }
    void testPage(){
        System.out.println("testing page");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the page"+websiteLink+"in GoogleChrome");
    }
    void testPage(){
        System.out.println("testing page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("closing the GoogleChrome browser");
    }
}
class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening the Firefox browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the page"+websiteLink+"in Firefox");
    }
    void testPage(){
        System.out.println("testing page in Firefox");
    }
    void closeBrowser(){
        System.out.println("closing the Firefox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the Safari browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the page"+websiteLink+"in Safari");
    }
    void testPage(){
        System.out.println("testing page in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the Safari browser");
    }
}
