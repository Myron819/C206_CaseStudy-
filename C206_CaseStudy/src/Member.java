
public class Member {
	private String name;
	private String gender;
	private int moblie;
	private String email;
	private String DOB;
	private String country;
	private String password;
	
	public String toString() {
		
		// Write your codes here
		return String.format("%-10s %-10s %-10s %-40s %-10s %-20s %-20s", getName(),getGender(),getMoblie(),getEmail(),getDOB(),getCountry(),getPassword());
	}
	
	public Member(String name, String gender, int moblie, String email, String dOB, String country, String password) {
		super();
		this.name = name;
		this.gender = gender;
		this.moblie = moblie;
		this.email = email;
		DOB = dOB;
		this.country = country;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMoblie() {
		return moblie;
	}

	public void setMoblie(int moblie) {
		this.moblie = moblie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}