import com.jayway.restassured.RestAssured;

public class RestApiExample {


    public static void main(String[] args){
        RestAssured.get("https://swapi.co/api/").
                    body().
                    prettyPrint();
    }


}
