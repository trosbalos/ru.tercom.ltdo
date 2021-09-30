package Backend;


import com.github.javafaker.Faker;
import lombok.Getter;

public class Configuration {
    @Getter
    private String token = "token";
    private String login = "admin";
    @Getter
    private String password = "ltstudents";
    @Getter
    private String UID = "e8cbe0a2-b0fa-4e1b-b349-f0ef66cf26e1";

    Faker faker = new Faker();
    @Getter
    public String RANDOM_LONG_STRING = faker.chuckNorris().fact()+faker.lebowski().quote()+faker.friends().quote();
    @Getter
    public String RANDOM_DIGITS_SERV = String.valueOf(faker.number().numberBetween(10, Integer.MAX_VALUE));
    @Getter
    public String RANDOM_DIGITS = RANDOM_DIGITS_SERV;
    @Getter
    public String RANDOM_ARTIST_NAME = faker.artist().name();
    @Getter
    public String RANDOM_ARTIST_LASTNAME = faker.gameOfThrones().character();
    @Getter
    public String RANDOM_ARTIST_MIDDlENAME = faker.lordOfTheRings().character();
    @Getter
    public String RANDOM_USER_EMAIL = faker.artist().name() + "@" + RANDOM_DIGITS + ".ru";
    @Getter
    public String RANDOM_CITY = faker.address().cityName();
    @Getter
    public String RANDOM_ADDRESS = faker.address().fullAddress();
    @Getter
    public String RANDOM_DEPARTMENT = faker.commerce().department();
    @Getter
    public String RANDOM_DEPARTMENT_DESCRIPTION = faker.chuckNorris().fact();
    @Getter
    public String QA_POSITION_ID = "d250b875-1d53-41a8-a7b3-6350887f4f71";
    @Getter
    public String OFFICE_ID = "45e12472-4f83-4be0-9845-01d44f31d506";
    @Getter
    public String DEPARTENT_ID = "1bfb1021-63f9-442b-b1c6-9c2a921d4da0";


    //Endpoints
    @Getter
private String authLogin = "https://auth.ltdo.xyz/auth/login";
    @Getter
private String userGet = "https://user.ltdo.xyz/users/get/?userId=";
    @Getter
private String createUser = "https://user.ltdo.xyz/users/create";

}
