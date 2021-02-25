package APIBDD.StepDefinitionPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.ListOfUsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;

import java.awt.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

public class ListOfUsersSteps extends BaseClass {

   //RequestSpecification requestSpecification;
   // Response response;

    ListOfUsers listOfUsers = new ListOfUsers();

    @Given("^base URI$")
    public void base_URI() throws Throwable {
        requestSpecification = given().baseUri(listOfUsers.getBaseURI());
    }

    @When("^user use get method resource$")
    public void user_use_get_method_resource() throws Throwable {
      response =   requestSpecification.when().get(listOfUsers.getResource());
    }

    @Then("^user should see response status code (\\d+)$")
    public void user_should_see_response_status_code(int arg1) throws Throwable {
        response.then().log().all().assertThat().statusCode(200)
                .body("data.id", hasItems(7,8,9,10));









      /*  String email = response.jsonPath().getString("data.email");
        System.out.println(email);


        int countItem = 0;
        //for(int i=0;i<name.length();i++){
        // if (name.charAt(i)==' ')
        if (email.toString().equalsIgnoreCase("rachel.howell@reqres.in"))
        {
            countItem++;
            // System.out.println(i);

        }
        //}
        System.out.println(countItem);*/
    }

    @Then("^user should validate body response successfully$")
    public void user_should_validate_body_response_successfully() throws Throwable {
    }

}
