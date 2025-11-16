package Pekan7_2511533012;

public class Akun {
	private String username;
	private String password;
	private String email;
	private int pin;
	
	public void setusername(String username) {
		this.username = username;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}
	
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	public String getemail() {
		return email;
	}
	public int getpin() {
		return pin;
	}
	
	public boolean ispasswordvalid() {
		return password.length() >= 6;
	}
	public boolean isemailvalid() {
		return email.contains("@") && email.contains(".");
	}
	public boolean ispinvalid() {
		return String.valueOf(pin).length() >= 6;
	}
}
