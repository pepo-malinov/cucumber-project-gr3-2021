package uni.pl.fmi.models;

import uni.pl.fmi.services.RegisterService;

public class RegisterScreenModel {

	private String username;
	private String password1;
	private String password2;
	private String email;
	private String registerMesssage;

	public void navigateToMe() {
		System.out.println("Отворена е страницата за регистрация в системата!");
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassowrd1(String password) {
		this.password1 = password;
	}

	public void setPassowrd2(String password) {
		this.password2 = password;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public void clickRegisterButton() {
		registerMesssage = RegisterService.register(username, password1, password2, email);
	}

	public String getRegisterMessage() {
		return registerMesssage;
	}

}
