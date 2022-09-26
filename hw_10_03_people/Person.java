package hw_10_03_people;

import java.util.List;
import java.util.Objects;


public class Person implements Comparable<Person> {
	String name;
	String surname;
	List <String> adress;
	List <Integer> phoneNumber;
	public Person(String name, String surname,List<String> adress,List<Integer> phoneNumber) {
		this.name=name;
		this.surname=surname;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public List<String> getAdress() {
		return adress;
	}

	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	
	@Override
	public int compareTo(Person o) {
		Person other = (Person)o;
		if(surname.compareTo(other.surname)==0)
			return name.compareTo(other.name);
		else
			return surname.compareTo(other.surname);
	}
	public Person search(Person o) {
		return  o;
	}

	@Override
	public String toString() {
		return "Person [" + name + "	"+ surname + "	" + adress + " " + phoneNumber+ "]";
	}


}
