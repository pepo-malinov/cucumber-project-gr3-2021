package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginScreenModel;

public class LoginSteps {

	LoginScreenModel loginScreenModel = new LoginScreenModel();

	@Given("^Потребитеял отваря екрана за вход в системата$")
	public void openLoginScreen() throws Throwable {
		loginScreenModel.navigateToMe();
	}

	@When("^Потребителя въведе потребителско име \"([^\"]*)\"$")
	public void addUserName(String username) throws Throwable {
		loginScreenModel.setUsername(username);
	}

	@When("^Въведе парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		loginScreenModel.setPassword(password);
	}

	@When("^Натисне върху бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginScreenModel.clickLoginButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		final String resultMessage = loginScreenModel.getLoginMessage();
		assertEquals(expectedMessage, resultMessage);
	}
}
