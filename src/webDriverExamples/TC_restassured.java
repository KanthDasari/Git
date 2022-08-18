package webDriverExamples;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_restassured {
	public static void main(String args[]) {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		int statuscode = res.getStatusCode();
		System.out.println(statuscode);
		System.out.println(res.getTime());
		
		
	}

}
