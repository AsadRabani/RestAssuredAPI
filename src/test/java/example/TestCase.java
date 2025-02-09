package example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestCase {

    @BeforeClass
	public void beforecalssf()
{
	RestAssured.baseURI="https://jsonplaceholder.typicode.com";}

    @Test
    public void getUsers()
    {
    	Response response = given()
    			.when()
    			.get("/users/1")
    			.then()
    			 .log().body() 
    			.statusCode(200)
    			.extract().response();
    		System.out.print("The response is "+response.jsonPath().getString("street"));
    	
    }
}


