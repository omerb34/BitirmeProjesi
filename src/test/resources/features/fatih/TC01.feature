@us07_fatih
Feature:TC01_Dean_mesajlari goruntuleyebilmelidir
  Background:login olma
    Given Kullanici Anasayfaya gider
    When Kullanici login butonuna tiklar
  Then Kullanici user name alanina valid bir değer girer
    Then Kullanici password alanina valid bir değer girer
    Then Kullanici lastLogin butonuna tiklar
    Then Kullanici menu butonuna tiklar
    Then Kullanici Main Menu alaninda yer alan Contact Get All linkini tiklar

    Scenario: TC01
      Then Then Kullanici Contact Get All alaninda yer alan mesajlari goruntuler
      Then kullanici sayfayi kapatir

      Scenario: TC02
      Then Kullanici Contact Get All alaninda yer alan mesajlarin yazarlarini goruntuler
        Then kullanici sayfayi kapatir

      Scenario: TC03
        Then Kullanici Contact Get All alaninda yer alan mesajlarin e-maillerini goruntuler
        Then kullanici sayfayi kapatir

      Scenario: TC04
      Then Kullanici Contact Get All alaninda yer alan mesajlarin gonderilme tarihlerini goruntuler
        Then kullanici sayfayi kapatir

        Scenario: TC05
        Then Kullanıcı Contact Get All alanında yer alan mesajların subject bilgilerini görüntüler
          Then kullanici sayfayi kapatir









