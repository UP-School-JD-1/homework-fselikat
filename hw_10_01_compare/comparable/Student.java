package hw_10_01_compare.comparable;
import java.util.Date;



public class Student implements Comparable <Object> { 
	public int no;
	protected String name;
	protected int year;
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	Date dob;
	protected String major;
	
	public Student(int no,String name,int year, Date dob, String major){
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
		
	}
	public Student() {
		
	}
	void study() {
		System.out.println(" Student is studying");
		
	}
	void register() {
		System.out.println("Vocational Student has just registered");
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		int result = 0;
		if (no == other.no)
			result = 0;
		else if (no < other.no)
			result = -1;
		else
			result = 1;
		return result;
	}
	
	
	

}
