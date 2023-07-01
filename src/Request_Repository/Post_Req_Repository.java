package Request_Repository;

import io.restassured.RestAssured;

public class Post_Req_Repository {
	public static String BaseURI() {
	      String baseURI = "https://reqres.in/";
	      return baseURI;
	}
	
	public static String Post_Resource() {
		String Post_Resporce = "api/users";
		return Post_Resporce;
	}

	public static String RequestBody() {
		String RequestBody = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return RequestBody;
		
	}
}
