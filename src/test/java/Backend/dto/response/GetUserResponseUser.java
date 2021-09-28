package Backend.dto.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "firstName",
        "lastName",
        "middleName",
        "gender",
        "dateOfBirth",
        "city",
        "status",
        "isAdmin",
        "startWorkingAt",
        "rate",
        "about",
        "isActive",
        "department",
        "position",
        "avatar",
        "role",
        "office"
})
@Generated("jsonschema2pojo")
@Getter
public class GetUserResponseUser {

    @JsonProperty("id")
    public String id;
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("middleName")
    public String middleName;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("dateOfBirth")
    public String dateOfBirth;
    @JsonProperty("city")
    public Object city;
    @JsonProperty("status")
    public String status;
    @JsonProperty("isAdmin")
    public Boolean isAdmin;
    @JsonProperty("startWorkingAt")
    public String startWorkingAt;
    @JsonProperty("rate")
    public Double rate;
    @JsonProperty("about")
    public String about;
    @JsonProperty("isActive")
    public Boolean isActive;
    @JsonProperty("department")
    public Object department;
    @JsonProperty("position")
    public Object position;
    @JsonProperty("avatar")
    public Object avatar;
    @JsonProperty("role")
    public Object role;
    @JsonProperty("office")
    public Object office;
}