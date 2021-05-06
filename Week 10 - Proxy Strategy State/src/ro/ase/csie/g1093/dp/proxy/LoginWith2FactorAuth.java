package ro.ase.csie.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LogInInterface{

	LogInInterface loginModule = null;
	
	public LoginWith2FactorAuth(LogInInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code == 1245) {
			return true;
		}
		else return false;
	}

	@Override
	public boolean login(String username, String pass) {
		if(this.loginModule.login(username, pass)) {
			System.out.println("Please input the generated code that you have received over SMS/Email");
			System.out.println("Check received code");
			if(checkGeneratedCode(1234)) {
				System.out.println("Hello " + username);
				return true;
			}
			else
			{
				System.out.println("The code is not correct!");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}
	
	

}
