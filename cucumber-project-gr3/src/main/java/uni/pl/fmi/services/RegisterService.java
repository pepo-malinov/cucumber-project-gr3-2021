package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.User;

public class RegisterService {

	public static String register(String username, String password1, String password2, String email) {

		if (email == null || "".equals(email)) {
			return "Въведете електронна поща";
		}
		if (username == null || "".equals(username)) {
			return "Въведете потребителско име";
		}

		if (password1 == null || "".equals(password1)) {
			return "Въведете парола";
		}

		if (password2 == null || password2.isEmpty()) {
			return "Потвърдете паролата";
		}

		if (password1 != password2) {
			return "Въведете еднакви пароли";
		}

		List<User> users = getUsers();

		final boolean isUsernameExists = users.stream().anyMatch(u -> u.getUsername().equals(username));

//		boolean isUsernameExists = false;
//		for (User user : users) {
//			if(user.getUsername().equals(username)) {
//				isUsernameExists=true;
//				break;
//			}
//		}

		if (isUsernameExists) {
			return "Потребителското име е заето";
		}
		final User newUser = new User(username, password1, email);
		users.add(newUser);
		return users.contains(newUser) ? "Успешно се регистрирахте" : "";
	}

	public static List<User> getUsers() {
		final User user = new User("name2", "password", "email@test.com");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}

}
