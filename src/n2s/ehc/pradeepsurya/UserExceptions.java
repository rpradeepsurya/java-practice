package n2s.ehc.pradeepsurya;

public class UserExceptions {

}

class InvalidUserId extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidUserId(String msg) {
		super(msg);
	}

}

class UserIdNotFound extends Exception {

	private static final long serialVersionUID = 1L;

	UserIdNotFound(String msg) {
		super(msg);
	}

}

class InvalidEntry extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidEntry(String msg) {
		super(msg);
	}

}
