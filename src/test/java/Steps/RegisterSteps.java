package Steps;

import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Wsciekly Paczek on 2018-02-20.
 */
public class RegisterSteps extends AbstractSteps {
    LoginPage loginPage = new LoginPage(driver);
    @Given("^Jestem na stronie Logowanie$")
    public void jestem_na_stronie_Logowanie() {
        loginPage.imOnLoginPage();
    }
    @Given("Wpisuje login \"([^\"]*)\" i haslo \"([^\"]*)\"$")
    public void wpisuje_login_I_Haslo(String username, String password) {
        loginPage.insertLogin(username);
        loginPage.insertPassword(password);
    }
    @Given("^Klikniecie na przycisk Zaloguj sie$")
    public void klikniecie_na_zaloguj_sie() {
        loginPage.submit();
    }
    @Then("^Jestem zalogowany$")
    public void jestem_zalogowany() {
        loginPage.logged();
    }
    @Then("^Nie jestem zalogowany$")
    public void nie_jestem_zalogowany() {
        loginPage.noLogged();
    }


}


