@US07Fatih
  Feature: US07_DeanMesajlariGoruntuler
    Scenario: DeanKullaniciMesajlariniGorur
      Given Dean tum mesajlari gormek icin get request yollar
      When user mesajlarda kullanici isminin oldugunu dogrular
      Then user mesajlarda kullanici mailinin goruntulendigini dogrular
      Then user mesajlarda subject alaninin goruntulendigini dogrular