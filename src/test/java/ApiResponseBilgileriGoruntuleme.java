import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class ApiResponseBilgileriGoruntuleme {

    @Test
    public void test01(){
        // https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request
        // gonderdigimizde donen Response’un,
        // status code’unun 200,
        // ve content type’inin application/json; charset=utf-8,
        // ve Server isimli Header’in degerinin Cowboy,
        // ve status Line’in HTTP/1.1 200 OK
        // ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.


        // 1.adim : end point'i belirle ve eger gerekli ise request body olustur
        String endPoint = "https://restful-booker.herokuapp.com/booking/10";
        // 2.adim : eger gorevde varsa expected response body olustur
        // 3.adim : request'i yollayip, donen response'i actualResponse olarak kaydet
        Response actualResponse = RestAssured.given().when().get(endPoint);
        // 4.adim : istenen assertion'lari yapin


        // status code’unun 200,
        // ve content type’inin application/json; charset=utf-8,
        // ve Server isimli Header’in degerinin Cowboy,
        // ve status Line’in HTTP/1.1 200 OK
        // ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
        actualResponse.then().assertThat().statusCode(200)
                                          .contentType("application/json; charset=utf-8")
                                          .header("Server","Cowboy")
                                          .statusLine("HTTP/1.1 200 OK");
    }
}
