import com.github.javafaker.Faker;

public class Configuration {

    public String BASE_URL = "https://ltdo.xyz/";
    public String USER_LOGIN = "trosbalos";
    public String USER_MAIL = "trosbalos@gmail.com";
    public String USER_PASSWORD = "Test-2021!";
    public String SPACES = "    ";
    public String SYMBOLS = "!@#$%^&*()";
    public String RUSSIAN_LANG = "русскийЯзык";


    Faker faker = new Faker();
    public String RANDOM_NUMBERS = String.valueOf(faker.number().numberBetween(10,Integer.MAX_VALUE ));
    public String RANDOM_ARTIST_NAME = faker.artist().name();
    public String RANDOM_USER_EMAIL = faker.artist().name() + "@" + faker.company().name() + ".ru";
    public String RANDOM_CITY = faker.address().cityName();
    public String RANDOM_ADDRESS = faker.address().fullAddress();
    public String RANDOM_DEPARTMENT = faker.commerce().department();




}
