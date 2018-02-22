package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wsciekly Paczek on 2018-02-19.
 */
public class AddressBookPage extends AbstractPage
{
    public AddressBookPage(WebDriver driver)
    {
        super(driver);
    }

    public void jestemNaStronieKsiazkiAdresowej(){
        driver.get(srodowisko + "profil/ksiazka-adresowa/");
    }
    public void klikamWDodajNowyAdres(){
        driver.findElement(By.xpath(".//a[@href='/profil/dodaj-adres/']")).click();
    }

    public void wybieramOdbiorce(){
        driver.findElement(By.xpath("//span[contains(text(),'osoba fizyczna')]")).click();
    }
    public void wybieramOdbiorcefirma(){
        driver.findElement(By.xpath("//span[contains(text(),'firma')]")).click();
    }
    public void wybieramAdresUzywany(){
        driver.findElement(By.xpath("//form[@name='personal']//div[@class='form-item address-for']//span[contains(text(),'rachunku')]")).click();
    }
    public void wybieramAdresUzywanyD(){
        driver.findElement(By.xpath("//form[@name='personal']//div[@class='form-item address-for']//span[contains(text(),'dostawie')]")).click();
    }
    public void wybieramAdresUzywanyF(){
        driver.findElement(By.xpath("//form[@name='company']//div[@class='form-item address-for']//div//div[@class='radio form-item-validate required']//label//span[contains(text(),'rachunku')]")).click();
    }
    public void wybieramAdresUzywanyDF(){
        driver.findElement(By.xpath("//form[@name='company']//div[@class='form-item address-for']//span[contains(text(),'dostawie')]")).click();

    }
    public void wypelniamAdresImie1(String arg3){
        driver.findElement(By.xpath("//input[@id='personal_address_name1']")).sendKeys(arg3);
    }
    public void wypelniamAdresImie2(String arg4){
        driver.findElement(By.xpath("//input[@id='personal_address_name2']")).sendKeys(arg4);
    }
    public void wypelniamUlica(String arg5){
        driver.findElement(By.xpath("//input[@id='personal_address_street1']")).sendKeys(arg5);
    }
    public void wypelniamUlica2(String arg6){
        driver.findElement(By.xpath("//input[@id='personal_address_street2']")).sendKeys(arg6);
    }
    public void wypelniamZipCode(String arg7){
        driver.findElement(By.xpath("//input[@id='personal_address_zip']")).sendKeys(arg7);
    }
    public void wypelniamMiasto(String arg8){
        driver.findElement(By.xpath("//input[@id='personal_address_city']")).sendKeys(arg8);
    }
    public void wypelniamTelefon(String arg9){
        driver.findElement(By.xpath("//input[@id='personal_address_user_phone']")).sendKeys(arg9);
    }
    public void wypelniamNazweAdresu(String arg10){
        driver.findElement(By.xpath("//input[@id='personal_address_name']")).sendKeys(arg10);
    }

    public void submitPersonal(){
        driver.findElement(By.xpath("//form[@name='personal']//div[@class='form-item']//button[@type='submit']")).click();
    }
    public void firmaNazwa1(String arg11){
        driver.findElement(By.xpath("//input[@id='company_address_name1']")).sendKeys(arg11);

    }
    public void firmaNazwa2(String arg12){
        driver.findElement(By.xpath("//input[@id='company_address_name2']")).sendKeys(arg12);

    }
    public void firmaNazwa3(){
        driver.findElement(By.xpath("//input[@id='company_address_name3']")).sendKeys("sss");

    }
    public void firmaNip(String arg13){
        driver.findElement(By.xpath("//input[@id='company_address_nip']")).sendKeys(arg13);

    }
    public void firmaUlica1(String arg14){
        driver.findElement(By.xpath("//input[@id='company_address_street1']")).sendKeys(arg14);

    }
    public void firmaUlica2(String arg15){
        driver.findElement(By.xpath("//input[@id='company_address_street2']")).sendKeys(arg15);

    }
    public void firmaMiasto(String arg16){
        driver.findElement(By.xpath("//input[@id='company_address_city']")).sendKeys(arg16);

    }
    public void firmaKod(String arg17){
        driver.findElement(By.xpath("//input[@id='company_address_zip']")).sendKeys(arg17);

    }
    public void firmaTelefon(String arg18){
        driver.findElement(By.xpath("//input[@id='company_address_user_phone']")).sendKeys(arg18);

    }
    public void firmaNazwaAdresu(String arg19){
        driver.findElement(By.xpath("//input[@id='company_address_name']")).sendKeys(arg19);

    }
    public void firmaSubmit(){
        driver.findElement(By.xpath("//form[@name='company']//div[@class='form-item']//button[@type='submit']")).click();

    }

    public void sprawdzanieBledow(String args20){
        Assert.assertTrue(args20, driver.findElement(By.xpath("//div[@class='error']//span[contains(text(),"+args20+")]")).isDisplayed());
    }
//    public void (){
//
//}

}
