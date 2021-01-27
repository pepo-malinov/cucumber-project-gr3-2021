package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class LoginSevice {

	public static String login(String username, String password) {
		//username.equals("Ivan");
		//"Ivan".equals(username);

		if (username == null && password == null) {
			return "Не сте въвели потребилтески данни!";
		}
		if (username == null) {
			return "Въведете потребителско име!";
		}
		if (password == null) {
			return "Въведете парола!";
		}
		
		final List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user -> 
											user.getUsername().equals(username) 
											&& user.getPassword().equals(password));
		return isUserMatch? "Успешно влязохте в системата!" : "Поребител с тези данни не съществува!";
	}

	public static List<User> getUsers() {
		final User user = new User();
		user.setUsername("Ivan");
		user.setPassword("Pass123!");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}

}
