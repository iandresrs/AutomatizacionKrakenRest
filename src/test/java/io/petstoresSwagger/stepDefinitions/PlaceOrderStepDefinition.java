package io.petstoresSwagger.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.petstoresSwagger.Steps.PlaceOrderStep;
import io.petstoresSwagger.models.PlaceOrderModel;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PlaceOrderStepDefinition {

    @Steps
    PlaceOrderStep placeOrderStep;
    @Given("^I want place an order for a pet to service \"([^\"]*)\"$")
    public void iWantPlaceAnOrderForAPetToService(String url, List<PlaceOrderModel> listOrder) {
        placeOrderStep.createOrderPet(url,listOrder);
    }

    @Then("^I validate the status code is (\\d+)$")
    public void iValidateTheStatusCodeIs(int status) {
        placeOrderStep.validateStatusCode(status);
    }


}
