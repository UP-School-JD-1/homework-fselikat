package hw_01_01_students;
import java.util.Date;

public class RegistrationOffice {
	RegistrationOffice regOff= new RegistrationOffice();
	
	
	public static void main (String[] args) {
		Student student1 = new Student();
		
				
	}
	RegistrationOffice (){
		
	}
	public Student getAStudent() {	
		Student s = null;
		
		int i = (int) (6 * Math.random());
		
		switch (i) {
		case 0:
			s = new Student(34, "Selika",2015,new Date(),"Electrical&Electronics Engineering");
			break;
		case 1:
			s = new VocationalStudent(13, "Ali", 2021,new Date(), "Medicine");
			break;
		case 2:
			s = new UndergraduateStudent(953, "Çiğdem", 2019 ,new Date(), "History","Archaeology");
			break;
		case 3:
			s = new GraduateStudent (57, "Fatih",2011 ,new Date(), "Philosophy", "Ayşen Şenay","Philosophy and Art");
			break;
		case 4:
			s =new MasterStudent (57, "Müberra",2011,new Date(), "Gastronomy", "Hakan BİRİNCİ","The cultural development of gastronomy");
			break;
		case 5:
			s = new PhdStudent (658, "Salih", 2020,new Date(), "Control Engineering", "Haluk Bayram","Quadcopters",true);
			break;
		}

		return s;
	}

	void registerStudent (Student student) {
			
		
		if(student instanceof PhdStudent){
			
			PhdStudent p = (PhdStudent)student;
			System.out.println("Your informations are checking");
			System.out.println(p.toString());
			System.out.println(p.getName()+"You have to write paper");
			p.register();
		}
		
		else if(student instanceof MasterStudent){
			MasterStudent m = (MasterStudent) student;
			System.out.println("Your informations are checking");
			System.out.println(m.toString());
			m.register();
		}
		
		
		else if(student instanceof GraduateStudent){
			GraduateStudent g = (GraduateStudent) student;
			System.out.println("Your informations are checking");
			System.out.println(g.toString());
			g.register();
			
				
		}
		
		else if(student instanceof UndergraduateStudent){
			UndergraduateStudent u = (UndergraduateStudent) student;
			System.out.println("Your informations are checking");
			u.register();
				
		} 
		else if(student instanceof VocationalStudent){
			VocationalStudent v = (VocationalStudent) student;
			System.out.println("Your informations are checking");
			System.out.println(v.toString());
			v.register();
			

		}
		else if(student instanceof Student){
			System.out.println("Your informations are checking");
			System.out.println(student.toString());
			student.register();
			
			
		}
		
		
	}
		

}
