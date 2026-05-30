package com.myself;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromiumDriver();
        driver.get("https://www.google.com"); // Der Browser navigiert zu Google.

        System.out.println(driver.getTitle());

        driver.quit(); // Beendet den ChromeDriver-Prozess komplett -> immer am ende verwenden

    }
}