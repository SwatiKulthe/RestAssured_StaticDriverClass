package Common_Methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Common_Utility_Method {

	public static void EvidanceCreator(String FileName,String RequestBody,int StatusCode, String ResponseBody) throws IOException
	{
		File Textfile = new File("E:\\testing_class_notes\\automation_assignments\\Evidence\\"+FileName+".txt");
		System.out.println("New blank text file of name: "+Textfile.getName());
	    FileWriter dataWrite = new FileWriter(Textfile);
	    
	    dataWrite.write("Request Body is : "+"\n\n" +RequestBody +"\n\n");
	    dataWrite.write("Status Code is : "+"\n\n" + StatusCode +"\n\n");
	    dataWrite.write("Response Body is :"+"\n\n" + ResponseBody);
	    
	    dataWrite.close();
	     System.out.println("RequestBody and ResponseBody is writen in Textfile " +Textfile.getName());
	}

}
