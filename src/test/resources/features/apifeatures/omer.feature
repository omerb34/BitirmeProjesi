@omerb
Feature:Gel All Message
Scenario: Dean_Kullanici_Mesajlarını_Gorur
  Given user tum kullanici mesajları icin bir get request yollar
  When status code 200 oldugunu dogrular
  Then gelen mesajlarda kullanici ismini gordugunu dogrular
  And gelen mesajlarda kullanici mailini gordugunu dogrular
  And gelen mesajlarda mesaj konusunu gordugunu dogrular