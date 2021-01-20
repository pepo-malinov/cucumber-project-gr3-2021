package uni.pu.fmi;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class User {

	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private Set<Order> orders;

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pass
	 * @return
	 */
	public void setPassword(String pass) {
		this.password = pass;
	}

	/**
	 * @return
	 */
	public Set<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 * @return
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @param order
	 * @return
	 */
	public void addOrder(Order order) {
		if (null == orders) {
			this.orders = new HashSet<>();
		}
		this.orders.add(order);
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

}