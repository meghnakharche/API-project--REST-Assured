package all_requests;
import POJO_Details.*;
import utils.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class GetRequest {
	@BeforeAll
	static void setup() {
	    RestAssured.baseURI = API_Info.BASE_URI;
	    RestAssured.requestSpecification = given()
	            .header("x-api-key", "reqres-free-v1")
	            .contentType(ContentType.JSON);
	}

	
	@Test
	void SingleUser()
    {
    Response resp= given().when().get("/users/2").then().statusCode(200).body("data.id",equalTo(2)).
    			   body("data.email",equalTo("janet.weaver@reqres.in")).extract().response();
   System.out.println("Get Request Response for single user: " + resp.asPrettyString());
    }

   @Test
	void AllUsersPage() {
		Response resp=given().when().get("/users?page=2").then().statusCode(200).body("page",equalTo(2)).
				      extract().response();
		System.out.println("Get response for all users:" +resp.asPrettyString());
		
	}
	
	@Test
	 void SingleResource() {
		Response resp= given().when().get("/unknown/2").then().statusCode(200).body("data.id",equalTo(2)).
				body("data.year",equalTo(2001)).
				extract().response();
		System.out.println("Get response for single resource:" +resp.asPrettyString());
	}


	
    

}


