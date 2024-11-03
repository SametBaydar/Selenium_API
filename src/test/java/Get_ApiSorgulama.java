import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class Get_ApiSorgulama {
    @Test
    public void test01(){
        // https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request gönderdiğimizde
        // dönen Response'u yazdırın

        // 1.adim : end point'i belirle ve eger gerekli ise request body olustur
        // 2.adim : eger gorevde varsa expected response body olustur
        // 3.adim : request'i yollayip, donen response'i actualResponse olarak kaydet
        // 4.adim : istenen assertion'lari yapin



        // 1.adim : end point'i belirle ve eger gerekli ise request body olustur
        String endPoint = "https://restful-booker.herokuapp.com/booking/10";
        // 2.adim : eger gorevde varsa expected response body olustur
        // 3.adim : request'i yollayip, donen response'i actualResponse olarak kaydet

        Response actualResponse = RestAssured.given().when().get(endPoint);
       // System.out.println(actualResponse);
        actualResponse.prettyPrint();
        // 4.adim : istenen assertion'lari yapin
    }
}
