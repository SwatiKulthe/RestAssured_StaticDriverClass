package Test_class;

import org.testng.Assert;

import Common_Methods.Post_Method;
import Request_Repository.Post_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Post_Ref_TC1 {
	public static void extractor() {
		int StatusCode = Post_Method.ResponseStatusCode
				(Post_Req_Repository.BaseURI(),
				Post_Req_Repository.Post_Resource(),
				Post_Req_Repository.RequestBody());
		System.out.println(StatusCode);
		
		String ResponseBody = Post_Method.ResponseBody
				(Post_Req_Repository.BaseURI(),
				 Post_Req_Repository.Post_Resource(),
				 Post_Req_Repository.RequestBody());
		System.out.println(ResponseBody);
		
		//declare expected result
		JsonPath JspRequest = new JsonPath(Post_Req_Repository.RequestBody());
		String Req_name = JspRequest.getString("name");
		String Req_job = JspRequest.getString("job");
		//parse ResponseBody
		JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");
		//validation
		Assert.assertEquals(Res_name, Req_name);
		Assert.assertEquals(Res_job, Req_job);
	}
	

}
