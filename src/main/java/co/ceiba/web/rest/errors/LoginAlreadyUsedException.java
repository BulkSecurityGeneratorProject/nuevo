package co.ceiba.web.rest.errors;

public class LoginAlreadyUsedException extends BadRequestAlertException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 447964308240798478L;

	public LoginAlreadyUsedException() {
        super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Login already in use", "userManagement", "userexists");
    }
}
