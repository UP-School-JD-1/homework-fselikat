package hw_10_01_compare.comparable;

import java.util.Date;

public class GraduateStudent extends Student {
	protected String advisor;
	protected String thesis;
	public GraduateStudent(int no,String name,int year,Date dob,String major, String advisor, String thesis){
		super(no,name,year,dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}
	void writeThesis() {
		System.out.println("Graduate Student writing thesis about "+ thesis);
		
	}
	void meetWithAdvisor() {
		System.out.println("Graduate Student is on a meeting with advisor about "+ thesis);
		
	}
	@Override
	void study() {
		System.out.println("Graduate Student is studying");
		
	}
	@Override
	void register() {
		System.out.println("Graduate Student has just registered");

	}
	@Override
	public String toString() {
		return "GraduateStudent [advisor=" + advisor + ", thesis=" + thesis + ", no=" + no + ", name=" + name
				+ ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

}
