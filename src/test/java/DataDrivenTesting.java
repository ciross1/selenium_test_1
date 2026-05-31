import com.myself.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DataDrivenTesting extends BaseTest {




    //Data Driven Testing bedeutet, dass du denselben Test mit verschiedenen Datansätzen ausführst, ohne den Test mehrfach
    // zu schreiben

    // Das Problem ohne Data Driven Testing ist folgendes - stell dir vor, du willst den Login mit dre verschiedenen Benutzern testen:

    /*@Test
void testLoginUser1() {
    loginPage.enterUsername("admin@yourstore.com");
    loginPage.enterPassword("admin");
    // ...
}

@Test
void testLoginUser2() {
    loginPage.enterUsername("wrong@email.com");
    loginPage.enterPassword("wrong");
    // ...
}

@Test
void testLoginUser3() {
    loginPage.enterUsername("another@email.com");
    loginPage.enterPassword("1234");
    // ...
}*/


    // Das ist viel Wiederholung. Mit Data Driven schreibst du den Test einmal und übergibst die daten von aussen.

    @ParameterizedTest // "Führe diesen test nicht einmal aus, sondern mehrmals - jedes Mal mit anderen daten.
    // Ohne @ParameterizedTest läuft ein @Test genau einmal. Mit @ParameterizedTest läuft dieselbe Methode so oft, wie du Datensätze angibst.

    @CsvSource({
            "admin@gmail.com, admin true",
            "admin2@gmail.com, 1234",
            "user@gmail.com, 12345"
    })
    void testValidLoginMitDaten(String username, String password){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        //Ein Test ohne "assertion" ist: kein richtiger Test


        Assertions.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Ungültiger Login sollte auf der Login-Seite bleiben");

        /*Wenn driver.getCurrentUrl().contains("login") true ergibt → Test bestanden, die Nachricht erscheint gar nicht.
Wenn driver.getCurrentUrl().contains("login") false ergibt → Test fehlgeschlagen, und in IntelliJ siehst du dann:*/

    }





}
