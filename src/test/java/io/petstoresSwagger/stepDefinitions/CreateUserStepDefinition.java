package io.petstoresSwagger.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.petstoresSwagger.Steps.CreateUserStep;
import io.petstoresSwagger.models.UserModel;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CreateUserStepDefinition {

    @Steps
    CreateUserStep createUserStep;

    @Given("^I want create user to service \"([^\"]*)\"$")
    public void iWantCreateUserToService(String url, List<UserModel> listUser)  {
        createUserStep.createPost(url,listUser);
    }

    @Then("^I validate the status code (\\d+)$")
    public void iValidateTheStatusCode(int status) {
        createUserStep.validateStatusCode(status);
    }
}
