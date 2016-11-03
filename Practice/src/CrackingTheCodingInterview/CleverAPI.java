package CrackingTheCodingInterview;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CleverAPI {

	public static void main(String ar[]) throws ClientProtocolException, IOException, JSONException
	{
	
		/*String body = Request.Get("https://api.clever.com/v1.1/sections/530e5979049e75a9262d0af2/students")
                .addHeader("Authorization", "Bearer DEMO_TOKEN")
                .execute().returnContent().asString();*/
		String body = Request.Get("https://api.clever.com/v1.1/sections")
                .addHeader("Authorization", "Bearer DEMO_TOKEN")
                .execute().returnContent().asString();
		JSONObject obj=new JSONObject(body);
		JSONArray arr=obj.getJSONArray("data");
		int counter=0;
		for(int i=0;i<arr.length();i++)
		{
			JSONObject obj2=new JSONObject(arr.get(i).toString());
			JSONObject obj3=new JSONObject(obj2.get("data").toString());
			//System.out.println(obj3.get("students").toString());
			JSONArray arr2=obj3.getJSONArray("students");
			counter+=arr2.length();
		}
		
		System.out.println(counter/arr.length());
		/*JSONArray arr=obj.getJSONArray("students");
		
		System.out.println(arr);*/
	}
	
}
