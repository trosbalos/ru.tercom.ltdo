package Backend;
import Backend.dto.response.GetUser.GetUserResponse;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


public class GetUserTest extends BaseTest {
    @Test
    void firstTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
        GetUserResponse response = given()
                .when()
                .header(getToken(), token)
                .get(getUserGet() + getUID())
                .then()
                .extract()
                .as(GetUserResponse.class);

        System.out.println(response.getStatus().toString());
        System.out.println(response.getBody().getUser().getLastName().toString());

    }
}