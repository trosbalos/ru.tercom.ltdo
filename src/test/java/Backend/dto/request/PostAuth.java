
package Backend.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LoginData",
        "Password"
})
@Getter
@Setter
public class PostAuth {

    @JsonProperty("LoginData")
    public String loginData;
    @JsonProperty("Password")
    public String password;

}