package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.RegisterScreenModel;

public class RegisterSteps {
	
	private RegisterScreenModel registerScreenModel = new RegisterScreenModel();
	
	@Given("^Потребителя отваря екрана за регистация$")
	public void openRegisterScreen() throws Throwable {
		registerScreenModel.navigateToMe();
	}

	@When("^Въвдеде потребителско име \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
		registerScreenModel.setUsername(username);
	}

	@When("^Въвдеде първа парола \"([^\"]*)\"$")
	public void addPassowrd1(String password) throws Throwable {
		registerScreenModel.setPassowrd1(password);
	}

	@When("^Въвдеде втора парола \"([^\"]*)\"$")
	public void addPassword2(String password) throws Throwable {
		registerScreenModel.setPassowrd2(password);
	}

	@When("^Въвдеде email \"([^\"]*)\"$")
	public void addEmail(String email) throws Throwable {
		registerScreenModel.setEmail(email);
	}

	@When("^Натисне бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
	    registerScreenModel.clickRegisterButton();
	}

	@Then("^Въжда съобщение \"([^\"]*)\"$")
	public void checkRegisterMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, registerScreenModel.getRegisterMessage());
	}
}
