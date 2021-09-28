package Backend;

import Backend.dto.request.PostAuth;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AuthTest extends BaseTest {


    @Test
    void firstTest() {
         given()
                .header("token",token)
                .when()
                .get("https://user.ltdo.xyz/users/find?skipCount=1&takeCount=15")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .prettyPeek()
                .jsonPath()
         ;
    }
    @Test
    void secondTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
        given()
                 .log()
                 .all()
                 .header("Content-Type","application/json")
                 .body("{\n" +
                         "    \"LoginData\": \"admin\",\n" +
                         "    \"Password\": \"ltstudents\"\n" +
                         "}")

                .when()
                .post("https://auth.ltdo.xyz/auth/login")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .prettyPeek()
                .jsonPath() ;
    }
    @Test
    void thirdTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
       PostAuth request = new PostAuth();
      request.setLoginData("admin");
      request.setPassword("ltstudents");
                given()
                 .log()
                 .all()
                 .when()
                 .header("Content-Type","application/json")
                 .body(request)
                 .post("https://auth.ltdo.xyz/auth/login")
                  .then().statusCode(200)
                 .extract()
                 .response()
                 .prettyPeek()
                 .jsonPath() ;
    }

//
//                .body("Content-Type: application/json")
//
//
//
//
////                .spec(responseSpecification)
//
//
//                .getString("accessToken");


//    }
//    @Test
//    void imageUploadFormDataURLBigResolutionTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, IMAGE_URL_BIG_RESOLUTION)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileJpgTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImageJpg)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileBmpTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImageBmp)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileGifTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImageGif)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFilePngTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImagePng)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileTxtTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImageTxt)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileBigFormatTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, catImageBigFormat)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileZeroTest() {
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, byte0Image)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataBase64Test() {
//        EncodeToBase64 encodeToBase64=new EncodeToBase64();
//        byte[] fileContent = encodeToBase64.getFileContentInBase64();
//        encodedImage = Base64.getEncoder().encodeToString(fileContent);
//        uploadedImageDeleteHashCode =  given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, encodedImage)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(responseSpecification)
//                .extract()
//                .response()
//                .prettyPeek()
//                .jsonPath()
//                .getString(DATA_DELETEHASH);;
//    }
//
//    @Test
//    void imageUploadFormDataFileMoreThan10mbTest() {
//        given()
//                .spec(reqSpec)
//                .multiPart(IMAGE_KEY, lilia54)
//                .expect()
//                .when()
//                .post(POST_IMAGE_REQUEST)
//                .then()
//                .spec(badRequestSpec);
//
//    }
//
//    @AfterEach
//    void tearDown() {
//        if(uploadedImageDeleteHashCode !=null){
//            given()
//                    .spec(reqSpec)
//                    .when()
//                    .delete(USERNAME_IMAGE_DELETEHASH, username, uploadedImageDeleteHashCode);
//            uploadedImageDeleteHashCode = null;}
//
//
//    }


}