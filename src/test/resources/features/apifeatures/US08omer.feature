@Us08
Feature: Vice Dean creates a lesson

  Scenario:TC01_Create_Lesson
    Given user sends post request to creata a lesson with Compulsory.
    Then user gets the lesson and assert that.

  #Scenario: TC02_Create_Lesson_Without_Complusory
     # Then user sends post request to create a lesson without Compulsory.
     # And user gets the lesson and assert that.