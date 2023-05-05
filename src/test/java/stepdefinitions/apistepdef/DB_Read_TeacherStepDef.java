package stepdefinitions.apistepdef;

import io.cucumber.java.en.*;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DB_Read_TeacherStepDef {

    Connection connection;
    ResultSet resultSet;
    @Given("find teacher in database by id")
    public void find_teacher_in_database_by_id() throws SQLException {
        //select * from teacher where id=50
       //connection= DriverManager.getConnection("jdbc:postgresql://139.59.159.36:5432/school_management","select_user","43w5ijfso");
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management","select_user","43w5ijfso");
       Statement statement = connection.createStatement();
        resultSet= statement.executeQuery("select * from teacher where id=50");
      resultSet.next();
        System.out.println(resultSet.getString(2));

    }
    @Then("Validate data")
    public void validate_data() throws SQLException {
        assertEquals("1990-10-15",resultSet.getString(2));
        assertEquals("Kadikoy",resultSet.getString("birth_place"));
        assertEquals("MALE",resultSet.getString("gender"));
        assertEquals("fatih",resultSet.getString("name"));
        assertEquals("222-254-2565",resultSet.getString("phone_number"));
        assertEquals("452-54-6598",resultSet.getString("ssn"));
        assertEquals("Jorge",resultSet.getString("username"));
        assertEquals("Jesus",resultSet.getString("surname"));
        assertEquals("fatihbey@gmail",resultSet.getString("email"));
        assertTrue(resultSet.getBoolean("is_advisor"));
        assertEquals(4,resultSet.getInt("user_role_id"));

    }

}
