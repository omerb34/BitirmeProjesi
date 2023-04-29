@Us08Omer
Feature: Vice Dean ders olusturabilmelidir

  Background: Kullanici_gecerli_url'ye_erisim_saglar
    Given kullanici sayfaya gider ve Vice Dean olarak Login olur
    Then kullanici hesabina erisim sagladigini dogrular
    When kullanici menu sekmesine tiklar
    Then kullanici Lesson Managment'e tiklar
    Then kullanici lesson'a tiklar

  Scenario: TC01_sign_olup_lesson_mangmente_tiklama
    Given Kullanici Lessons Managmante ulastigini dogrular
    Then kullanici sayfayi kapatir

  Scenario: TC02_LessonName_CreditScore_Girilip_Submit_Yapilmasi
    Given kullanici Lesson Name kutusunu gorur
    Then kullanici Credit Score kutucusunu gorur
    Then kullanici Lesson Name kutusu altındaki Required yazisini gorur
    Then Kullanici Credit Score kutusu altındaki Required yazisini gorur
    When kullanici Lesson Name icin data girer
    When kullanici Credit Score icin data girer
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    Then kullanici sayfayi kapatir

  Scenario: TC03_Credit_Score_alanina_harf_girilememesi
    Given kullanici Lesson Name kutusunu gorur
    Then kullanici Credit Score kutucusunu gorur
    Then kullanici Lesson Name kutusu altındaki Required yazisini gorur
    Then Kullanici Credit Score kutusu altındaki Required yazisini gorur
    When kullanici Lesson Name icin data girer
    When kullanici Credit Score icin harf girer
    Then kullanici Submit tusuna basar
    Then kullanici "JSON parse error" uyarisini almalidir
    Then kullanici sayfayi kapatir

  Scenario: TC04_Credit_Score_alanina_ozel_karakter_girilememesi
    Given kullanici Lesson Name kutusunu gorur
    Then kullanici Credit Score kutucusunu gorur
    Then kullanici Lesson Name kutusu altındaki Required yazisini gorur
    Then Kullanici Credit Score kutusu altındaki Required yazisini gorur
    When kullanici Lesson Name icin data girer
    When kullanici Credit Score icin ozel karakter girer
    Then kullanici Submit tusuna basar
    Then kullanici "JSON parse error" uyarisini almalidir
    Then kullanici sayfayi kapatir

  Scenario:TC05_Compulsory_Alani_Tiklanmadan_Ders_Kaydi_Yapilmasi
    Given kullanici Lesson Name icin data girerr
    Then kullanici Credit Score icin data girer
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    Then kullanici sayfayi kapatir


  Scenario:  TC06_Compulsory_Alani_Tiklanarak_Ders_Kaydi_Yapilmasi
    Given kullanici Lesson Name icin data girerrr
    When kullanici "Compulsory" kutucugunun varligini dogrular
    Then kullanici Compulsory kutucuguna tiklar
    Then kullanici Credit Score icin data girer
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    Then kullanici sayfayi kapatir



