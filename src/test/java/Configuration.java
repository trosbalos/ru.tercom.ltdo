import com.github.javafaker.Faker;
import com.github.javafaker.Number;

public class Configuration {

    public String BASE_URL = "https://ltdo.xyz/";
    public String USER_LOGIN = "trosbalos";
    public String USER_MAIL = "trosbalos+1@gmail.com";
    public String USER_PASSWORD = "4ZZ8p_K0yAv";
    public String SPACES = "    ";
    public String SYMBOLS = "!@#$%^&*()";
    public String RUSSIAN_LANG = "русскийЯзык";


    Faker faker = new Faker();
    public String RANDOM_NUMBERS = String.valueOf(faker.number().numberBetween(10,Integer.MAX_VALUE ));
    public String RANDOM_ARTIST_NAME = faker.artist().name();
    public String RANDOM_USER_EMAIL = faker.artist().name() + "@" + faker.company().name() + ".ru";
    public String RANDOM_TEXT = faker.friends().quote();



}
