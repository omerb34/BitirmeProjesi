@Us08
  Feature: Vice Dean creates a lesson
    Scenario:TC01_Create_Lesson
      Given user sends post request to creata a lesson with Compulsory.
      Then user gets the lesson and assert that.
     # Then user sends post request to create a lesson without Compulsory.
     # And user gets the lesson and assert that.