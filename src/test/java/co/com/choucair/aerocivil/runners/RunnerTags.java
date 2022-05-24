package co.com.choucair.aerocivil.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/aerocivilPdf.feature",
        tags = "@HU",
        glue = {"co.com.choucair.aerocivil.stepdefinitions","co.com.choucair.aerocivil.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}
