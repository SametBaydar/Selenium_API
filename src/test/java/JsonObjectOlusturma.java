import org.json.JSONObject;
import org.junit.Test;

public class JsonObjectOlusturma {

    @Test
    public void test01(){
        /*
        {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
             "bookingdates":{
                            "checkin":"2018-01-01",
                             "checkout":"2019-01-01"
                             },
             "totalprice":111,
             "depositpaid":true,
             "lastname":"Brown"
          }
         */

        JSONObject bookingDatesJsonObject = new JSONObject();
        bookingDatesJsonObject.put("checkin","2018-01-01");
        bookingDatesJsonObject.put("checkout","2019-01-01");

        JSONObject rezervasyonJsonObject = new JSONObject();
        rezervasyonJsonObject.put("firstname","Jim");
        rezervasyonJsonObject.put("additionalneeds","Breakfast");
        rezervasyonJsonObject.put("bookingdates",bookingDatesJsonObject);
        rezervasyonJsonObject.put("totalprice",111);
        rezervasyonJsonObject.put("depositpaid",true);
        rezervasyonJsonObject.put("lastname","Brown");
    }
}
