package hw_03_01_interfacestudents;

import java.util.Date;

public class VocationalStudent extends AbstractStudent{
	public VocationalStudent(int no,String name,int year,Date dot,String major){
		super(no,name,year,dot, major);

	}
	@Override
	public void study() {
		System.out.println("Vocational Student is studying");
		
	}
	@Override
	public void register() {
		System.out.println("Vocational Student has just registered");
		
	}
	@Override
	public String toString() {
		return "VocationalStudent [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
