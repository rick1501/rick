package com.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/elements.feature",
        glue = "com.demo.stepDefinitions",
        tags = "@testcases",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
