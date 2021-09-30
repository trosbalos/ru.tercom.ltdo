package Backend.dto.request.CreateUser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FirstName",
        "LastName",
        "MiddleName",
        "Gender",
        "Status",
        "IsAdmin",
        "Rate",
        "PositionId",
        "OfficeId",
        "DepartmentId",
        "Password",
        "Communications"
})
@Getter
@Setter
public class CreateUserRequest {

    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("MiddleName")
    public String middleName;
    @JsonProperty("Gender")
    public String gender;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("IsAdmin")
    public Boolean isAdmin;
    @JsonProperty("Rate")
    public String rate;
    @JsonProperty("PositionId")
    public String positionId;
    @JsonProperty("OfficeId")
    public String officeId;
    @JsonProperty("DepartmentId")
    public String departmentId;
    @JsonProperty("Password")
    public String password;
    @JsonProperty("Communications")
    public List<CreateUserCommunications> communications = new ArrayList<CreateUserCommunications>();

}