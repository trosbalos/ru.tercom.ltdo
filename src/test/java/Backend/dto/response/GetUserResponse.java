package Backend.dto.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "body",
        "status",
        "errors"
})
@Generated("jsonschema2pojo")
public class GetUserResponse {

    @JsonProperty("body")
    public GetUserResponseBody body;
    @JsonProperty("status")
    public String status;
    @JsonProperty("errors")
    public List<Object> errors = new ArrayList<Object>();

}