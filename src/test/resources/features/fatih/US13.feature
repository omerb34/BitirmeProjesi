@us13UI
  Feature: us13_ViceDean_Teacher_olusturabilmeli
    Scenario: create_a_teacher
      Given user go the "url"
      Given user click login
      Given login as a vice dean
      Then choose a lesson in dropdown of lessons
      Then fill in name and surname
      Then fill in birth place
      Then fill in mailBox and phoneBox
      Then select gender
      Then fill in date of birth
      Then fill ssn, username and password
      Then click submit buton
      Then validate of teacher which is viceDean created
