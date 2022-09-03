import com.sun.org.apache.xerces.internal.xs.StringList;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

    @Test
    public void getPet(){
        when()
                .get("https://petstore.swagger.io/v2/pet/1907")
                .then()
                .statusCode(404);

    }

    @Test
    public void postPet(){
       /* String[] url = new String[0];
        Map<String,Object> tags = new HashMap<String,Object>();
        tags.put("id","0");
        tags.put("name","string");

        Map map = new HashMap<String,Object>();
        JSONObject request = new JSONObject(map);
        request.put("id","0");
        Map<String,Object> mapCategory = new HashMap<String,Object>();
        JSONObject mapCategoryReq = new JSONObject(mapCategory);
        mapCategoryReq.put("id","3");
        mapCategoryReq.put("name","string");
        request.put("name","pamuk");
        request.put("photoUrls",url);
        request.put("category",mapCategoryReq);
        request.put("tags",tags);
        request.put("status","available");


        System.out.println(request);
*/
    }



}
