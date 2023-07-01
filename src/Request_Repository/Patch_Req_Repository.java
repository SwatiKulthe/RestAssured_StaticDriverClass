package Request_Repository;

public class Patch_Req_Repository {
	public static String baseURI() {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}

	public static String Patch_Resource() {
		String Patch_Resource = "/api/users/2";
		return Patch_Resource;
	}

	public static String Patch_Req_TC1() {
		String Patch_Req_TC1 = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}";
		return Patch_Req_TC1;
	}

}
