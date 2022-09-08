package hw_03_01_interfacestudents;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	protected String minor;
	
	 public UndergraduateStudent(int no,String name,int year,Date dob,String major, String minor){
		super(no,name,year, dob, major);
		this.minor = minor;
	}
	
	@Override
	public void study() {
		System.out.println("Undergraduate Student is studying");
		
	}
	@Override
	public void register() {
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
		return "UndergraduateStudent [minor=" + minor + "]";
	}
	

}
