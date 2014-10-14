package codigo;

@SuppressWarnings("serial")
public class UserLoginException extends Exception {
	String str;

	public UserLoginException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String getMessage() {
		return str;
	}

}
