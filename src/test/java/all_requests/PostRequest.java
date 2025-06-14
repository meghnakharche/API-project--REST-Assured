package all_requests;
import utils.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PostRequest {
	
	@BeforeAll
	static void setup() {
	    RestAssured.baseURI = API_Info.BASE_URI;
	}
	
	@Test
	void createUser() {
		
		String user="{\"name\" : \"Laster\" , \"job\" : \"Leader\" }";
		
		Response resp= given().header("x-api-key", "reqres-free-v1").contentType(ContentType.JSON).
				body(user).when().post("/users").then().statusCode(201).body("name",equalTo("Laster")).extract().response();
		
		
		System.out.println("Post Request Response:"+resp.asPrettyString());
		
	}

}
