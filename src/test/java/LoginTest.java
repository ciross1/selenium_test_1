import com.myself.pages.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{


    @Test
    void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLoginButton();

        System.out.println("Title of the page: " + driver.getTitle());

    }


}
