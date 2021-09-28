package Backend.dto.response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user",
        "skills",
        "communications",
        "certificates",
        "achievements",
        "projects",
        "educations"
})
@Generated("jsonschema2pojo")
@Getter
public class GetUserResponseBody {

    @JsonProperty("user")
    public GetUserResponseUser user;
    @JsonProperty("skills")
    public Object skills;
    @JsonProperty("communications")
    public List<GetUserResponseCommunication> communications = new ArrayList<GetUserResponseCommunication>();
    @JsonProperty("certificates")
    public Object certificates;
    @JsonProperty("achievements")
    public Object achievements;
    @JsonProperty("projects")
    public Object projects;
    @JsonProperty("educations")
    public Object educations;

}