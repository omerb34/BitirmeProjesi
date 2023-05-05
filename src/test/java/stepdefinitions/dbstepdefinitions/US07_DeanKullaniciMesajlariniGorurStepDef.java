package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US07_DeanKullaniciMesajlariniGorurStepDef {
    ResultSet resultSet;
    Connection connection;
    Statement statement;



    @Given("Dean gets contact message with email")
    public void deanGetsContactMessageWithemail() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management","select_user","43w5ijfso");

        statement = connection.createStatement();

        resultSet = statement.executeQuery("select * from contact_message where email='omrbrg@gmail.com'");
        //select * from contact_message where email='omrbrg@gmail.com'

        resultSet.next();

    }
    @Then("validate headers")
    public void validate_headers() throws SQLException {
        assertEquals("omer",resultSet.getString(5));
        assertEquals("2023-05-05",resultSet.getString(2));
        assertEquals("omrbrg@gmail.com",resultSet.getString(3));
        assertEquals("omerbb",resultSet.getString(6));
        assertEquals("sondenememesajıdb",resultSet.getString(4));


    }


}
/*

        "object": {
            "name": "omer",
            "email": "omrbrg@gmail.com",
            "subject": "omerbb",
            "message": "sondenememesajıdb",
            "date": "2023-05-05"
        },
        "message": "Contact Message Created Successfully",
        "httpStatus": "CREATED"
        }
 */
