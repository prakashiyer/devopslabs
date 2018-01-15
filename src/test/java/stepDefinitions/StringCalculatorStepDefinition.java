package stepDefinitions;

import com.devops.labs.StringCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class StringCalculatorStepDefinition {

    private int result =0;
    @Given("^two numbers \"([^\"]*)\"$")
    public void twoNumbers(String arg0) throws Throwable {
        StringCalculator calc = new StringCalculator();
        result = calc.calculate(arg0);
    }


    @Then("^result (\\d+)$")
    public void result(int arg0) throws Throwable {
       Assert.assertEquals(arg0, result);
    }
}
