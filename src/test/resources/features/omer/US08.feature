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

