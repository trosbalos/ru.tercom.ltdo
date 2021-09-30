package Backend.dto.response.GetUser;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "body",
        "status",
        "errors"
})
@Getter
public class GetUserResponse {

    @JsonProperty("body")
    public GetUserResponseBody body;
    @JsonProperty("status")
    public String status;
    @JsonProperty("errors")
    public List<Object> errors = new ArrayList<Object>();

}