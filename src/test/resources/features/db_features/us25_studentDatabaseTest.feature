@us25DB_Test
  Feature: Student_database_test
    Scenario: Admin_shouldbe_read_students_which_is_created
      Given Find student in database by id
      Then validate that