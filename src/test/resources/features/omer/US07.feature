@us07Omer
Feature:US07_OMER

  Background:
    Given kullanici sayfaya gider ve Login olur
    Then kullanici hesabina erisim sagladigini dogrular
    When kullanici menu sekmesine tiklar
    Then kullanici Contact Get All'a tiklar


  Scenario: TC_01_
    When kullanici Contact Message basligini gordugunu dogrular
    Then kullanici sayfayi kapatir


  Scenario: TC_02_Dean_kullanici_mesajlarini_gorur
    When kullanici message kutusunu gorur
    Then kullanici mesaj kutusunun bos olmadigini dogrular
    Then kullanici sayfayi kapatir

  Scenario: TC_03_Dean_mesajlarda_kullanici_ismini_gorur
    When kullanici "name" kutusunu gorur
    Then kullanici "name" kutusunun bos olmadigini dogrular
    Then kullanici sayfayi kapatir

  Scenario: TC_04_Dean_mesajlarda_kullanici_email_gorur
    When kullanici email kutusunu gorur
    Then kullanici email kutusunun bos olmadigini dogrular
    Then kullanici sayfayi kapatir

  Scenario: TC_05_Dean_mesajlarda_kullanici_Subjecti_gorur
    When kullanici subject kutusunu gorur
    Then kullanici subject kutusunun bos olmadigini dogrular
    Then kullanici sayfayi kapatir

  Scenario: TC_06_Dean_mesajlarda_kullanici_Date_gorur
    When kullanici Date kutusunu gorur
    Then kullanici Date kutusunun bos olmadigini dogrular
    Then kullanici sayfayi kapatir

