package uni.pl.fmi.models;

import uni.pl.fmi.services.LoginSevice;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void navigateToMe() {
		System.out.println("Отворена е страницата за вход в системата!");
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password=password;		
	}

	public void clickLoginButton() {
		message = LoginSevice.login(username, password);
		
	}

	public String getLoginMessage() {
		return message;
	}

}
