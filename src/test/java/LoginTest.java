import com.myself.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends BaseTest{


    @Test
    void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLoginButton();



        System.out.println("Title of the page: " + driver.getTitle());

        // Hier wird geprüft, ob die aktuelle URL das Wort "login" enthält.
        // Dieser Ausdruck muss true sein, sonst schlägt der Test fehl
        Assertions.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "Bei falschem Login sollte man auf der Login-Seite bleiben"
        );


    }


}
