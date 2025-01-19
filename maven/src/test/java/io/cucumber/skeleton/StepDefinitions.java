package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    static Belly belly = new Belly();
    static int hours;

    @Before
    public void informationStringStart(){
        System.out.println("The test is starting");
    }

    @After
    public void informationStringFinish(){
        System.out.println("The test is finished");
    }

    @Given("мой живот пустой")
    public void myBellyIsEmpty() {
        belly.empty();
        Assertions.assertEquals(0, belly.getCookiesInBelly());
    }

    @Given("я съел {int} печененки")
    public void iHaveEatenSomeCookies(int cookies) {
        belly.eat(cookies);
        Assertions.assertEquals(cookies, belly.getCookiesInBelly());
    }

    @When("я жду {int} час")
    public void iAmWaitingForSomeTime(int hoursToWait) {
        hours = hoursToWait;
        System.out.println("I am waiting for " + hours + " hours");
    }

    @Then("мой живот журчит")
    public void myBellyIsGurgling() {
        belly.gurgle(hours);
        Assertions.assertEquals(0, belly.getCookiesInBelly());
    }
}
