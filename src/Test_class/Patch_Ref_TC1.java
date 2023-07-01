package Test_class;

import org.testng.Assert;
import Common_Methods.Patch_Method;
import Request_Repository.Patch_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Patch_Ref_TC1 {
	public static void extractor() {

		int StatusCode = Patch_Method.ResponseStatusCode(Patch_Req_Repository.baseURI(),
				Patch_Req_Repository.Patch_Resource(), Patch_Req_Repository.Patch_Req_TC1());
		System.out.println(StatusCode);

		String ResponseBody = Patch_Method.ResponseBody(Patch_Req_Repository.baseURI(),
				Patch_Req_Repository.Patch_Resource(), Patch_Req_Repository.Patch_Req_TC1());
		System.out.println(ResponseBody);

		// parse responsebody
		JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");
		// validate responsebody
		Assert.assertEquals(Res_name, "morpheus");
		Assert.assertEquals(Res_job, "zion resident");
	}

}
