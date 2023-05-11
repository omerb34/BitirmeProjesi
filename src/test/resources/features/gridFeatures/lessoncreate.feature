@Grid
Feature: Grid Test

  @chrome
  Scenario: TC01_user_creates_lesson
    Given kullanici siteye chrome ile gider
    Given kullanici sayfaya gider ve Vice Dean olarak Login olur
    When kullanici menu sekmesine tiklar
    Then kullanici Lesson Managment'e tiklar
    Then kullanici lesson'a tiklar
    When kullanici Lesson Name icin data girmelidir
    When kullanici Credit Score icin data girmelidir
    Then kullanici Compulsory kutucuguna tiklar
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    #Then kullanici sayfayi kapatir

  @edge
  Scenario: TC02_user_creates_lesson
    Given kullanici siteye edge ile gider
    Given kullanici sayfaya gider ve Vice Dean olarak Login olur
    When kullanici menu sekmesine tiklar
    Then kullanici Lesson Managment'e tiklar
    Then kullanici lesson'a tiklar
    When kullanici Lesson Name icin data girmelidir
    When kullanici Credit Score icin data girmelidir
    Then kullanici Compulsory kutucuguna tiklar
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    #Then kullanici sayfayi kapatir


  @firefox
  Scenario: TC03_user_creates_lesson
    Given kullanici siteye firefox ile gider
    Given kullanici sayfaya gider ve Vice Dean olarak Login olur
    When kullanici menu sekmesine tiklar
    Then kullanici Lesson Managment'e tiklar
    Then kullanici lesson'a tiklar
    When kullanici Lesson Name icin data girmelidir
    When kullanici Credit Score icin data girmelidir
    Then kullanici Compulsory kutucuguna tiklar
    Then kullanici Submit tusuna basar
    Then kullanici "Lesson Created" yazisini gorur
    #Then kullanici sayfayi kapatir

