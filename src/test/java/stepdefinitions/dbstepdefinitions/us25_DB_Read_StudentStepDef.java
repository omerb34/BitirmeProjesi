package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.*;
import org.postgresql.Driver;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class us25_DB_Read_StudentStepDef {
    Connection connection;
    ResultSet resultSet;
    @Given("Find student in database by id")
    public void find_student_in_database_by_id() throws SQLException {
       connection= DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management"
                ,"select_user","43w5ijfso");
       Statement statement =connection.createStatement();
       resultSet= statement.executeQuery("select * from student where id=159");
      resultSet.next();
        System.out.println(resultSet.getString(2));
    }
    @Then("validate that")
    public void validate_that() throws SQLException {
        assertEquals("159",resultSet.getString("id"));
        assertEquals("2023-04-08",resultSet.getString("birth_day"));
        assertEquals("Kadıköy",resultSet.getString("birth_place"));
        assertEquals("MALE",resultSet.getString("gender"));
        assertEquals("456-456-7894",resultSet.getString("phone_number"));
        assertEquals("456-98-6547",resultSet.getString("ssn"));
        assertEquals("deSouza",resultSet.getString("surname"));
        assertEquals("AlexDeSouza",resultSet.getString("username"));
        assertEquals("rumizm8@hot",resultSet.getString("email"));
        assertEquals("Jesus",resultSet.getString("father_name"));
        assertTrue(resultSet.getBoolean("is_active"));
        assertEquals("mary",resultSet.getString("mother_name"));
        assertEquals(1156,resultSet.getInt("student_number"));
        assertEquals(5,resultSet.getInt("user_role_id"));
        assertEquals(13,resultSet.getInt("advisor_teacher_id"));




    }
}
