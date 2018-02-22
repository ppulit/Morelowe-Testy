package Steps;

import PageObject.AddressBookPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Wsciekly Paczek on 2018-02-19.
 */
public class AddressBookSteps extends AbstractSteps {

    AddressBookPage addressBookPage;

    public AddressBookSteps()
    {
        super();
        this.addressBookPage = new AddressBookPage(AddressBookSteps.driver);
    }
    @Before
    public void testSetup()
    {
        AbstractSteps.driver.manage().deleteAllCookies();
        AbstractSteps.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void testClose(Scenario scenario)
    {
        if(AbstractSteps.driver instanceof WebDriver) {

            AbstractSteps.driver.close();
        }
        AbstractSteps.driver = null;
    }

    @Given("^Jestem na stronie ksiazki adresowej$")
    public void jestem_na_stronie_ksiazki_adresowej() throws Throwable {
        addressBookPage.jestemNaStronieKsiazkiAdresowej();
    }

    @When("^Klikam w Dodaj nowy adres$")
    public void klikam_w_Dodaj_nowy_adres() throws Throwable {
        addressBookPage.klikamWDodajNowyAdres();
    }


    @When("^Wybierz odbiorce osoba fizyczna$")
    public void wybierz_odbiorce_osoba_fizyczna() throws Throwable {
        addressBookPage.wybieramOdbiorce();
    }
    @When("^Wybierz odbiorce firma$")
    public void wybierz_odbiorce_firma() throws Throwable {
        addressBookPage.wybieramOdbiorcefirma();
    }


    @When("^Wybierz adres uzywany w rachunku$")
    public void wybierz_adres_uzywany_w_rachunku() throws Throwable {
        addressBookPage.wybieramAdresUzywany();
    }
    @When("^Wybierz adres uzywany w dostawie")
    public void wybierz_adres_uzywany_w_dostawie() throws Throwable {
        addressBookPage.wybieramAdresUzywanyD();
    }
    @When("^Wybierz adres uzywany w rachunku firma$")
    public void wybierz_adres_uzywany_w_rachunku_f() throws Throwable {
        addressBookPage.wybieramAdresUzywanyF();
    }
    @When("^Wybierz adres uzywany w dostawie firma")
    public void wybierz_adres_uzywany_w_dostawie_f() throws Throwable {
        addressBookPage.wybieramAdresUzywanyDF();
    }


    @When("^Wypełniam pole ksiazki imię \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_imię(String arg3) throws Throwable {
        addressBookPage.wypelniamAdresImie1(arg3);
    }

    @When("^Wypełniam pole ksiazki nazwisko \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_nazwisko(String arg4) throws Throwable {
        addressBookPage.wypelniamAdresImie2(arg4);
    }

    @When("^Wypełniam pole ksiazki ulica \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_ulica(String arg5) throws Throwable {
        addressBookPage.wypelniamUlica(arg5);
    }

    @When("^Wypełniam pole ksiazki numer domu \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_numer_domu(String arg6) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addressBookPage.wypelniamUlica2(arg6);
    }

    @When("^Wypełniam pole ksiazki miejscowość \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_miejscowość(String arg7) throws Throwable {
        addressBookPage.wypelniamMiasto(arg7);
    }

    @When("^Wypełniam pole ksiazki kod pocztowy \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_kod_pocztowy(String arg8) throws Throwable {
        addressBookPage.wypelniamZipCode(arg8);
    }

    @When("^Wypełniam pole ksiazki telefon \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_telefon(String arg9) throws Throwable {
        addressBookPage.wypelniamTelefon(arg9);
    }

    @When("^Wypełniam pole ksiazki nazwa adresu \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_nazwa_adresu(String arg10) throws Throwable {
        addressBookPage.wypelniamNazweAdresu(arg10);
    }

    @When("^Klikam Zapisz Adres$")
    public void klikam_Zapisz_Adres() throws Throwable {
        addressBookPage.submitPersonal();

    }

    @Then("^Dodany jest adres do ksiazki \"([^\"]*)\"$")
    public void dodany_jest_adres_do_ksiazki(String nazwa1) throws Throwable {

    }

    @When("^Wypełniam pole nazwa \"([^\"]*)\"$")
    public void wypełniam_pole_nazwa(String arg11) throws Throwable {
        addressBookPage.firmaNazwa1(arg11);

    }

    @When("^Wypełniam pole nazwa cd \"([^\"]*)\"$")
    public void wypełniam_pole_nazwa_cd(String arg12) throws Throwable {
        addressBookPage.firmaNazwa2(arg12);
    }

    @When("^Wypełniam pole nip \"([^\"]*)\"$")
    public void wypełniam_pole_nip(String arg13) throws Throwable {
        addressBookPage.firmaNip(arg13);
    }

    @When("^Wypełniam pole firma ulica \"([^\"]*)\"$")
    public void wypełniam_pole_firma_ulica(String arg14) throws Throwable {
        addressBookPage.firmaUlica1(arg14);
    }

    @When("^Wypełniam pole firma numer domu \"([^\"]*)\"$")
    public void wypełniam_pole_firma_numer_domu(String arg15) throws Throwable {
        addressBookPage.firmaUlica2(arg15);
    }

    @When("^Wypełniam pole firma miejscowość \"([^\"]*)\"$")
    public void wypełniam_pole_firma_miejscowość(String arg16) throws Throwable {
        addressBookPage.firmaMiasto(arg16);
    }

    @When("^Wypełniam pole firma kod pocztowy \"([^\"]*)\"$")
    public void wypełniam_pole_firma_kod_pocztowy(String arg17) throws Throwable {
        addressBookPage.firmaKod(arg17);
    }

    @When("^Wypełniam pole firma telefon \"([^\"]*)\"$")
    public void wypełniam_pole_firma_telefon(String arg18) throws Throwable {
        addressBookPage.firmaTelefon(arg18);
    }
    @When("^Wypełniam pole ksiazki nazwa adresu firma \"([^\"]*)\"$")
    public void wypełniam_pole_ksiazki_nazwa_adresu_firma(String arg19) throws Throwable {
        addressBookPage.firmaNazwaAdresu(arg19);
    }

    @When("^Klikam Zapisz Adres Firma$")
    public void klikam_Zapisz_Adres_Firma() throws Throwable {
        addressBookPage.firmaSubmit();

    }
    @Then("^Otrzymuje komunikat o bledzie \"([^\"]*)\"$")
    public void otrzymuje_komunikat_o_bledzie(String args20) {
        addressBookPage.sprawdzanieBledow(args20);
    }



}
