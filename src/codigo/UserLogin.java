package codigo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserLogin implements Serializable {
	private String login;
	private String password;

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public UserLogin(String login, String password) throws UserLoginException {
		if (validarLogin(login, password)) {
			this.login = login;
			this.password = password;
		} else {
			throw new UserLoginException(
					"Error....usuario o contraseña incorrectos");
		}
	}

	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	private static boolean validarLogin(String login, String password) {

		if (login.equals("Admin") && password.equals("1234")) {
			return true;
		} else

			return false;

	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "UserLogin [login=" + login + ", password=" + password + "]";
	}

}
