package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US08_ViceDeanCreatsLesseonStepDefinitions {
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("get the lesson with id")
    public void getTheLessonWithId() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");

        statement = connection.createStatement();

        resultSet = statement.executeQuery("select * from lesson where lesson_name='SiyasetFelsefesi'");
        // select * from lesson where lesson_name='SiyasetFelsefesi'

        resultSet.next();

    }

    @Then("validate it")
    public void validateIt() throws SQLException {
        assertEquals("846", resultSet.getString("lesson_id"));
        assertEquals("8",resultSet.getString("credit_score"));
        assertEquals("t",resultSet.getString("is_compulsory"));
        assertEquals("SiyasetFelsefesi",resultSet.getString("lesson_name"));

        connection.close();
        statement.close();
        resultSet.close();

    }
}
/*
[
        {
        "lessonId": 846,
        "lessonName": "SiyasetFelsefesi",
        "creditScore": 8,
        "compulsory": true
        }
        ]
 */
