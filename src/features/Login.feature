@Login
Feature: Logowanie

  Scenario: Logowanie istniejacego klienta
    Given Jestem na stronie Logowanie
    #Tutaj podac swoj login haslo!
    When Wpisuje login "xxxx@xxx.pl" i haslo "haslo111"
    And Klikniecie na przycisk Zaloguj sie
    Then Jestem zalogowany
