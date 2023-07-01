package Test_class;

import org.testng.Assert;
import Common_Methods.Put_Method;
import Request_Repository.Put_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Put_Ref_TC1 {
	public static void extractor() {
		int StatusCode = Put_Method.ResponseStatusCode(Put_Req_Repository.baseURI(), Put_Req_Repository.Put_Resource(),
				Put_Req_Repository.Put_Req_TC1());
		System.out.println(StatusCode);

		String ResponseBody = Put_Method.ResponseBody(Put_Req_Repository.baseURI(), Put_Req_Repository.Put_Resource(),
				Put_Req_Repository.Put_Req_TC1());
		System.out.println(ResponseBody);
		// parse responsebody
		JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");
		// Validate responseBody
		Assert.assertEquals(Res_name, "morpheus");
		Assert.assertEquals(Res_job, "zion resident");
	}

}
