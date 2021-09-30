package Backend.dto.request.CreateUser;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Type",
        "Value"
})
@Getter
@Setter
public class CreateUserCommunications {

    @JsonProperty("Type")
    public String type;
    @JsonProperty("Value")
    public String value;

}