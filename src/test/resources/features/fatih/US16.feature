@us16
Feature: US_16
  Background:
    Given Kullanıcı Anasayfaya gider
    When Kullanıcı login butonuna tıklar
  Then Kullanıcı user name alanına valid bir değer girer
    Then Kullanıcı password alanına valid bir değer girer
    Then Kullanıcı lastLogin butonuna tıklar
    Then Kullanıcı menu butonuna tıklar
  Then Kullanıcı Main Menu alanında yer alan Contact Get All linkini tıklar

    Scenario: TC01
    Then Kullanıcı Contact Get All alanında yer alan Contact Message yazısini goruntuler
      Then kullanici sayfayi kapatir

    Scenario: TC02
  Then Kullanıcı Contact Get All alanında yer alan mesajları görüntüler
      Then kullanici sayfayi kapatir

      Scenario: TC03
      Then Kullanıcı Contact Get All alanında yer alan mesajların yazarlarını görüntüler
        Then kullanici sayfayi kapatir

        Scenario: TC04
        Then Kullanıcı Contact Get All alanında yer alan mesajların e-maillerini görüntüler
          Then kullanici sayfayi kapatir

          Scenario: TC05
            Then Kullanıcı Contact Get All alanında yer alan mesajların gönderilme tarihlerini görüntüler
            Then kullanici sayfayi kapatir

            Scenario: TC06
            Then Kullanıcı Contact Get All alanında yer alan mesajlarınn subject bilgilerini görüntüler
              Then kullanici sayfayi kapatir



