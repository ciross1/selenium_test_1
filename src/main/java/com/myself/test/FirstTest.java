package com.myself.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {


    public void ersterTest(){

        WebDriver driver = new ChromeDriver();

        // Das ist eine Wartezeit — du sagst Selenium: „Wenn du ein Element
        // auf der Seite nicht sofort findest, warte bis zu 500 Millisekunden bevor du einen Fehler wirfst
        //Webseiten laden nicht gleichzeitig, eine Schachtelfläche oder ein Text feld erscheint erst eine halbe Sekunde später.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.get("https://admin-demo.nopcommerce.com/login"); // Der Browser navigiert zu Google.
        String titel = driver.getTitle();
        System.out.println(titel);

        WebElement emailBox =  driver.findElement(By.id("Email"));
        emailBox.sendKeys("admin@yourstore.com");


        //wird durch das id des Elements durchgesucht
        //sendKeys() -> Funktion um tasten zu senden oder etwas einzutippen









        // driver.close();
        // driver.quit(); // Beendet den ChromeDriver-Prozess komplett -> immer am ende verwenden

    }


}
