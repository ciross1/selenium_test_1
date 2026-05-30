package com.myself.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

     private WebDriver webDriver;

    // Diese Zeile speichert einen Selektor in einer Variable.
    // Sie sagt Selenium: "Das Element, das ich als usernameTextBox kenne, findest du im HTML anhand der ID Email
    private By usernameTextBox = By.id("Email");
    private By passwordTextBox = By.id("Password");
    private By buttonLogin = By.cssSelector("#main > div > section > div > div.page-body > div.customer-blocks > div > form > div.buttons > button");


      public LoginPage(WebDriver webDriver){
          this.webDriver = webDriver;

      }


      public void enterUsername(String username){
          webDriver.findElement(usernameTextBox).clear();
          webDriver.findElement(usernameTextBox).sendKeys(username);

      }

    public void enterPassword(String password){
        webDriver.findElement(passwordTextBox).clear();
        webDriver.findElement(passwordTextBox).sendKeys(password);

    }
    public void clickLoginButton(){
        webDriver.findElement(buttonLogin).click();

    }

}
