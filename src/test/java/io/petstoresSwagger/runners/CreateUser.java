package io.petstoresSwagger.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createUser.feature",
        glue = "io.petstoresSwagger.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateUser {
}