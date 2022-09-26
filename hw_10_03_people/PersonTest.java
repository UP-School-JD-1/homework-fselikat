package hw_10_03_people;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person("Afra","Okutan",new ArrayList <>(Arrays.asList("Korkuteli/Antalya","Muratpaşa/Antalya","Isparta")),new ArrayList <>(Arrays.asList(53455544,7542254)));
		Person p2=new Person("Esad","Okutan",new ArrayList <>(Arrays.asList("Korkuteli/Antalya","Konyaaltı/Antalya")),new ArrayList <>(Arrays.asList(6595544,7843216)));
		Person p3=new Person("Gamze","Yılmaztekin",new ArrayList <>(Arrays.asList("Çankaya/Ankara","Kepez/Antalya")),new ArrayList <>(Arrays.asList(6445649)));
		Person p4=new Person("Barış","Yılmaztekin",new ArrayList <>(Arrays.asList("Çankaya/Ankara","Döşemealtı/Antalya","Merkez/Diyarbakır")),new ArrayList <>(Arrays.asList(5989843)));
		Person p5=new Person("Asiye","Demirtaş",new ArrayList <>(Arrays.asList("Korkuteli/Antalya","Muratpaşa/Antalya","Isparta")),new ArrayList <>(Arrays.asList(14656,68696566)));
		Person p6=new Person("Mehmet","Ak",new ArrayList <>(Arrays.asList("Alsancak/İzmir","Karşıyaka/İzmir")),new ArrayList <>(Arrays.asList(9845,89888)));
		Person p7=new Person("FatmaSelika","Tuğ",new ArrayList <>(Arrays.asList("Korkuteli/Antalya","Muratpaşa/Antalya","Üsküdar/İstanbul")),new ArrayList <>(Arrays.asList(4876,98879,131)));
		TreeSet <Person> people = new TreeSet<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);
		people.add(p5);
		
		System.out.println("Soyada göre sıralanmış liste");
		
		people.iterator().forEachRemaining(System.out::println);
		Map<String, Person> map1 = new HashMap<>();
		Map<String, Person> map2 = new HashMap<>();
		Map<List<String>, Person> map3 = new HashMap<>();
		Map<List<Integer>, Person> map4 = new HashMap<>();
		map1.put(p1.getName(), p1);
		map2.put(p2.getSurname(), p2);
		map3.put(p3.getAdress(), p3);
		map4.put(p4.getPhoneNumber(), p4);
		
		map1.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map2.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map3.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
		map4.forEach((k, v) -> System.out.println("anahtar kelime: " + k + ", kişi bilgisi: " + v));
	}

}
