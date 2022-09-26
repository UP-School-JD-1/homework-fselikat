package hw_10_01_compare.comparable;

import java.util.Date;

public class UndergraduateStudent extends Student {
	protected String minor;
	
	 public UndergraduateStudent(int no,String name,int year,Date dob,String major, String minor){
		super(no,name,year, dob, major);
		this.minor = minor;
	}
	
	@Override
	void study() {
		System.out.println("Undergraduate Student is studying");
		
	}
	@Override
	void register() {
		System.out.println("Undergraduated Student has just registered");

		
	}
	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [minor=" + minor + ", no=" + no + ", name=" + name + ", year=" + year + ", dob="
				+ dob + ", major=" + major + "]";
	}

	
	

}
