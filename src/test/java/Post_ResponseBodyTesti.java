import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

public class Post_ResponseBodyTesti {

    @Test
    public void test01(){
        /*
        https://jsonplaceholder.typicode.com/posts url’ine asagidaki body ile bir POST request
gonderdigimizde
 {
 "title":"API",
 "body":"API ogrenmek ne guzel",
 "userId":10,
 }
donen Response’un,
 status code’unun 201,
 ve content type’inin application/json
 ve Response Body'sindeki,
 "title"'in "API" oldugunu
 "userId" degerinin 100'den kucuk oldugunu
 "body" nin "API" kelimesi icerdigini
 test edin.
         */
        // 1.adim : end point'i belirle ve eger gerekli ise request body olustur
        String endPoint ="https://jsonplaceholder.typicode.com/posts";
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","API");
        requestBody.put("body","API ogrenmek ne guzel");
        requestBody.put("userId",10);
        // 2.adim : eger gorevde varsa expected response body olustur
        // 3.adim : request'i yollayip, donen response'i actualResponse olarak kaydet
        Response response = RestAssured.given().contentType(ContentType.JSON)
                                        .when().body(requestBody.toString())
                                        .post(endPoint);
        // 4.adim : istenen assertion'lari yapin
        response.then().assertThat()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .body("title", Matchers.equalTo("API"))
                .body("userId",Matchers.lessThan(100))
                .body("body",Matchers.containsString("API"));
    }
}
