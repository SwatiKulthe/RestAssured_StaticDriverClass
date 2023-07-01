package Test_class;

import Common_Methods.Get_Method;
import Request_Repository.Get_Req_Repository;

public class Get_Ref_TC1 {
	public static void extractor() {
		int StatusCode = Get_Method.ResponseStatusCode(Get_Req_Repository.baseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(StatusCode);

		String ResponseBody = Get_Method.ResponseBody(Get_Req_Repository.baseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(ResponseBody);
	}
}
