@Gridomer
Feature: Grid Test
  Scenario: TC01_user_creates_lesson
    Given kullanici siteye gider
    Given kullanici sayfaya gider ve Vice Dean olarak Login olur
    When kullanici menu sekmesine tiklar
    Then kullanici Lesson Managment'e tiklar
    Then kullanici lesson'a tiklar
    When kullanici Lesson Name icin data girmelidir
    When kullanici Credit Score icin data girmelidir
    Then kullanici Compulsory kutucuguna tiklar
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    Then kullanici sayfayi kapatir

