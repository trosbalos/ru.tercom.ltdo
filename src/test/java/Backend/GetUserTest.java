package Backend;

import Backend.dto.response.GetUserResponse;
import Backend.dto.response.GetUserResponseUser;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetUserTest extends BaseTest {
    @Test
    void firstTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
        GetUserResponseUser response = given()
                .when()
                .header("token", token)
                .get("https://user.ltdo.xyz/users/get/?userId=e8cbe0a2-b0fa-4e1b-b349-f0ef66cf26e1")
                .then()
                .extract()
                .as(GetUserResponseUser.class);

        System.out.println(response.getStatus().toString());
        System.out.println(response.getFirstName().toString());
        System.out.println(response.getLastName().toString());
    }
}