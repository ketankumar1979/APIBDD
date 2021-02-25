package APIBDD.StepDefinitionPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.PostUsers;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostUsersSteps extends BaseClass {

    PostUsers postUsers = new PostUsers();

    @Given("^base URI, ContentType and body$")
    public void base_URI_ContentType_and_body() throws Throwable {
        requestSpecification = given().baseUri(postUsers.postBaseURI()).contentType(ContentType.JSON)
                .body(postUsers.postPayload());

    }

    @When("^user uses POST method with resource and query param$")
    public void user_uses_POST_method_with_resource_and_query_param() throws Throwable {
    response = requestSpecification.when().post(postUsers.postResource());
    }

    @Then("^user should get correct response and validate status code, body\\.$")
    public void user_should_get_correct_response_and_validate_status_code_body() throws Throwable {
        response.then().log().all().assertThat().statusCode(201).and().body("name", is("morpheus"));
        String name = response.jsonPath().getString("name");
        System.out.println(name);


        int countItem = 0;
        //for(int i=0;i<name.length();i++){
        // if (name.charAt(i)==' ')
        if (name.toString().equals("morpheus")) ;
        {
            countItem++;
            // System.out.println(i);

        }
        //}
        System.out.println(countItem);

    }
    }

