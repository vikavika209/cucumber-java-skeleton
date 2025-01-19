package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class StepDefinitions {

    static Belly belly = new Belly();
    static int hours;

    @BeforeEach
    public void informationStringStart(){
        System.out.println("The test is starting");
    }

    @AfterEach
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
