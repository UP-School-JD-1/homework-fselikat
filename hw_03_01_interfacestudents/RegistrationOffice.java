package hw_03_01_interfacestudents;
import java.util.Date;

public class RegistrationOffice {
	
	public static void main (String[] args) {
		RegistrationOffice regOff= new RegistrationOffice();
		AbstractStudent student1=regOff.getAStudent();

		regOff.registerStudent(student1);
		
	}
	public AbstractStudent getAStudent() {	
		AbstractStudent s = null;
		
		int i = (int) (5 * Math.random());
		
		switch (i) {
		case 0:
			s = new VocationalStudent(13, "Ali", 2021,new Date(), "Medicine");
			break;
		case 1:
			s = new UndergraduateStudent(953, "Çiğdem", 2019 ,new Date(), "History","Archaeology");
			break;
		case 2:
			s = new GraduateStudent (57, "Fatih",2011 ,new Date(), "Philosophy", "Ayşen Şenay","Philosophy and Art");
			break;
		case 3:
			s =new MasterStudent (57, "Müberra",2011,new Date(), "Gastronomy", "Hakan BİRİNCİ","The cultural development of gastronomy");
			break;
		case 4:
			s = new PhdStudent (658, "Salih", 2020,new Date(), "Control Engineering", "Haluk Bayram","Quadcopters",true);
			break;
		}

		return s;
	}
		
	void registerStudent (AbstractStudent student) {	
		if(student instanceof PhdStudent){
			
			PhdStudent p = (PhdStudent)student;
			p.register();
		}
		
		else if(student instanceof MasterStudent){
			MasterStudent m = (MasterStudent) student;
			m.register();
		}
		
		
		else if(student instanceof GraduateStudent){
			GraduateStudent g = (GraduateStudent) student;
			g.register();
			
				
		}
		
		else if(student instanceof UndergraduateStudent){
			UndergraduateStudent u = (UndergraduateStudent) student;
			u.register();
				
		} 
		else if(student instanceof VocationalStudent){
			VocationalStudent v = (VocationalStudent) student;
			v.register();
			

		
			
		}
	}
		
				
}
	

	
