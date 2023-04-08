@us07
Feature:Login Olma

  Scenario: TC_01
    Given kullanici sayfaya gider ve Login olur
    Then kullanici hesabina erisim sagladigini dogrular
    When kullanici menu sekmesine tiklar
    Then kullanici Contact Get All'a tiklar
    Then kullanici Contact Message basligini gordugunu dogrular
    Then kullanici sayfayi kapatir