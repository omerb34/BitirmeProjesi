@apius08
Feature: Vice Dean creates lessons
  Scenario:TC01_Create_Lesson
    Given Kullanici olusturdugu ilk dersi gormek icin bir get request gonderir
    Then Kullanici olusturdugu ilk dersi gordugunu dogrular

    Scenario: TC02_Create_Lesson_Without_Complusory
      Given Kullanici olusturdugu ikinci dersi gormek icin bir get request gonderir
      Then Kullanici olusturdugu ikinci dersi gordugunu dogrular


