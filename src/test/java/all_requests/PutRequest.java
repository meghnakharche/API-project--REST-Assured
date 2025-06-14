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

public class PutRequest {
	
	@BeforeAll
	static void setup() {
	    RestAssured.baseURI = API_Info.BASE_URI;
	}
	
	@Test
	void UpdateUser() {
		
		String user="{\"name\" : \"Laster\" , \"job\" : \"BA\" }";
		Response resp= given().header(API_Info.HEADER_NAME,API_Info.API_KEY).contentType(ContentType.JSON).body(user).
				when().put("users/2").then().statusCode(200).body("name", equalTo("Laster")).extract().response();
		
		System.out.println("Put response :"+resp.asPrettyString());
	}
	

}
