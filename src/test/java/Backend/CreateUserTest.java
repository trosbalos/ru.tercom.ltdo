package Backend;

import Backend.dto.request.CreateUser.CreateUserCommunications;
import Backend.dto.request.CreateUser.CreateUserRequest;;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CreateUserTest extends BaseTest {

    @Test
    void createRandomUser() {
        CreateUserCommunications communications = new CreateUserCommunications();
        communications.setType("Email");
        communications.setValue(RANDOM_USER_EMAIL);
        List<CreateUserCommunications> list = new ArrayList<CreateUserCommunications>();
        list.add(communications);

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
        CreateUserRequest request = new CreateUserRequest();
        request.setFirstName(RANDOM_ARTIST_NAME);
        request.setLastName(RANDOM_ARTIST_LASTNAME);
        request.setMiddleName(RANDOM_ARTIST_MIDDlENAME);
        request.setGender("Male");
        request.setStatus("Vacation");
        request.setIsAdmin(true);
        request.setRate("1");
        request.setPositionId(QA_POSITION_ID);
        request.setOfficeId(OFFICE_ID);
        request.setDepartmentId(DEPARTENT_ID);
        request.setPassword(RANDOM_DIGITS);
        request.setCommunications(list);
        given()
                .log()
                .all()
                .when()
                .header(getToken(), token)
                .header("Content-Type","application/json")
                .body(request)
                .post(getCreateUser())
                .then()
                .statusCode(201)
                .extract()
                .response()
                .prettyPeek()
                .jsonPath() ;
    }
}
