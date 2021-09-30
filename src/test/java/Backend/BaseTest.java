package Backend;

import Backend.dto.request.PostAuth.PostAuth;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.is;

public class BaseTest extends Configuration{
   static String token;
   static String auth ="https://auth.ltdo.xyz/auth/login";


//    ValidatableResponse uploadedImageDeleteHashCode;
//    static ResponseSpecification responseSpecification = null;
//    static ResponseSpecification badRequestSpec = null;
//    static RequestSpecification reqSpec;
//    protected static Properties prop = new Properties();
//    protected static String token;
//    protected static String username;
//    protected static Map<String, String> headers = new HashMap<>();

    @BeforeAll
   static void savedToken(){
        //Логирование
        RestAssured.filters(new AllureRestAssured());
        //Получаем токен
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
        PostAuth request = new PostAuth();
        request.setLoginData("admin");
        request.setPassword("ltstudents");
       token =  given()
                .log()
                .all()
                .when()
                .header("Content-Type","application/json")
                .body(request)
                .post(auth)
                .then().statusCode(200)
                .extract()
                .response()
                .prettyPeek()
                .jsonPath()
                .getString("accessToken");
    }

//    static void beforeAll() {
//        loadProperties();
//        token = prop.getProperty("token");
//        headers.put("Authorization", token);
//
//        RestAssured.baseURI = prop.getProperty("base.url");
//        username = prop.getProperty("username");
//        loadProperties();
//
//        token = prop.getProperty("token");
//        username = prop.getProperty("username");
//
//        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
//        RestAssured.baseURI = prop.getProperty("base.url");
//        RestAssured.filters(new AllureRestAssured());
//
//        responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
////                .expectContentType(ContentType.JSON)
////                .expectBody("success", is(true))
////                .expectBody("data.id", is(notNullValue()))
////                .expectBody("data.description", is(nullValue()))
////                .expectBody("data.animated", is(false))
////                .expectBody("data.in_gallery", is(false))
//                .expectContentType(ContentType.JSON)
//                .build();
//
//
//        badRequestSpec = new ResponseSpecBuilder()
//                .expectStatusCode(400)
//                .expectStatusLine("HTTP/1.1 400 Bad Request")
//                .expectContentType(ContentType.JSON)
//                .build();
//
//
//        reqSpec = new RequestSpecBuilder()
//                .addHeader("token", token)
//                .setAccept(ContentType.ANY)
//                .build();
//
//
//
//    }
//
//    private static void loadProperties() {
////        try {
////            prop.load(new FileInputStream("src/test/application.properties"));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
}