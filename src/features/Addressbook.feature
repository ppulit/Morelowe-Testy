@AddressBook
Feature: Ksiazka Adresowa

  Background:
    Given Jestem zalogowany na stronie login "xxx@morele.net" haslo "haslo111"


  Scenario: Dodanie nowego adresu do ksiazki adresowej os.fiz/rachunek
    Given Jestem na stronie ksiazki adresowej
    When Klikam w Dodaj nowy adres
    And Wybierz odbiorce osoba fizyczna
    And Wybierz adres uzywany w rachunku
    And Wypełniam pole ksiazki imię "TestValidate"
    And Wypełniam pole ksiazki nazwisko "Testowe"
    And Wypełniam pole ksiazki ulica "Testowa"
    And Wypełniam pole ksiazki numer domu "1234"
    And Wypełniam pole ksiazki miejscowość "Testowa"
    And Wypełniam pole ksiazki kod pocztowy "32-020"
    And Wypełniam pole ksiazki telefon "111111111"
    And Wypełniam pole ksiazki nazwa adresu "Testowy adres os. fiz"
    And Klikam Zapisz Adres
    Then Dodany jest adres do ksiazki "DUPA "

  Scenario: Dodanie nowego adresu do ksiazki adresowej os.fiz/dostawa
    Given Jestem na stronie ksiazki adresowej
    When Klikam w Dodaj nowy adres
    And Wybierz odbiorce osoba fizyczna
    And Wybierz adres uzywany w dostawie
    And Wypełniam pole ksiazki imię "TestValidate"
    And Wypełniam pole ksiazki nazwisko "Testowe Imie"
    And Wypełniam pole ksiazki ulica "Testowa ulica"
    And Wypełniam pole ksiazki numer domu "1"
    And Wypełniam pole ksiazki miejscowość "Testowa Miejscowosc"
    And Wypełniam pole ksiazki kod pocztowy "32-020"
    And Wypełniam pole ksiazki telefon "111111111"
    And Wypełniam pole ksiazki nazwa adresu "Adres dostawy"
    And Klikam Zapisz Adres
    Then Dodany jest adres do ksiazki "DUPA "

  Scenario: Dodanie nowego adresu do ksiazki adresowej firma/rachunek
    Given Jestem na stronie ksiazki adresowej
    When Klikam w Dodaj nowy adres
    And Wybierz odbiorce firma
    And Wybierz adres uzywany w rachunku firma
    And Wypełniam pole nazwa "TestValidate"
    And Wypełniam pole nazwa cd "Testowe Imie"
    And Wypełniam pole nip "6762603898"
    And Wypełniam pole firma ulica "Testowa ulica"
    And Wypełniam pole firma numer domu "1"
    And Wypełniam pole firma miejscowość "Testowa Miejscowosc"
    And Wypełniam pole firma kod pocztowy "32-020"
    And Wypełniam pole firma telefon "111111111"
    And Wypełniam pole ksiazki nazwa adresu firma "Adres dostawy"
    And Klikam Zapisz Adres Firma
    Then Dodany jest adres do ksiazki "DUPA "

  Scenario: Dodanie nowego adresu do ksiazki adresowej firma/dostawa
    Given Jestem na stronie ksiazki adresowej
    When Klikam w Dodaj nowy adres
    And Wybierz odbiorce firma
    And Wybierz adres uzywany w dostawie firma
    And Wypełniam pole nazwa "TestValidate"
    And Wypełniam pole nazwa cd "Testowe Imie"
    And Wypełniam pole nip "6762603898"
    And Wypełniam pole firma ulica "Testowa ulica"
    And Wypełniam pole firma numer domu "1"
    And Wypełniam pole firma miejscowość "Testowa Miejscowosc"
    And Wypełniam pole firma kod pocztowy "32-020"
    And Wypełniam pole firma telefon "111111111"
    And Wypełniam pole ksiazki nazwa adresu firma "Adres dostawy"
    And Klikam Zapisz Adres Firma
    Then Dodany jest adres do ksiazki "DUPA "

  Scenario: Sprawdzenie pola imie liczby
    Given Jestem na stronie ksiazki adresowej
    When Klikam w Dodaj nowy adres
    And Wybierz odbiorce osoba fizyczna
    And Wypełniam pole ksiazki imię "12345"
    Then Otrzymuje komunikat o bledzie "Niepoprawne znaki!"







