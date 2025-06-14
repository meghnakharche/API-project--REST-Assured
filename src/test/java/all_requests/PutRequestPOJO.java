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

public class PutRequestPOJO {
	
	@BeforeAll
	static void setup() {
	    RestAssured.baseURI = API_Info.BASE_URI;
	}
	
	@Test
	void createUser() {
		
		//serialization
		PutUser user= new PutUser("Sam","Assistant");
		Response resp= given().header(API_Info.HEADER_NAME,API_Info.API_KEY).contentType(ContentType.JSON).
				body(user).when().put("users/2").then().statusCode(200).body("name",equalTo("Sam")).extract().response();
		
		//deserialization
		PutUser res=  resp.as(PutUser.class);
		System.out.println("Post Request POJO Response");
		System.out.println(res);
		
	}

}
