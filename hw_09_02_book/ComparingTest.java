package hw_09_02_book;
import java.util.function.BinaryOperator;
import java.util.Comparator;

public class ComparingTest {

	public static void main(String[] args) {
		Book book1 =new Book("Yaşam Bilgeliği Üzerine Aforizmalar","Arthur Schopenhauer",1851,222 );
		Book book2 =new Book("İnsanın Anlama Yetisi Üzerine Bir Soruşturma","Davıd Hume",1748,165);
		Book book3 =new Book("Körlük","José Saramago",1995,331);
		Book book4 =new Book("Mülksüzler","Ursula K. Le Guin",1974,335);
		Comparator<Book> comparator1 = (b1, b2) -> b1.getPage() > b2.getPage() ? 1 : -1;
		BinaryOperator<Book> maxPage = BinaryOperator.maxBy(comparator1);
		Book maxPage1 = maxPage.apply(book1, book2);
		Book maxPage2 = maxPage.apply(book3, book4);

		System.out.println("Daha çok sayfa sayısına sahip olan kitap: " + maxPage1);
		System.out.println("Daha çok sayfa sayısına sahip olan kitap: " + maxPage2);
		
		Comparator<Book> comparator2 = (b1, b2) -> b1.getName().length() > b2.getName().length() ? 1 : -1;
		BinaryOperator<Book> maxName = BinaryOperator.maxBy(comparator2);
		Book maxName1 = maxName.apply(book1, book3);
		Book maxName2 = maxName.apply(book2, book4);

		System.out.println("Daha uzun isme sahip olan kitap: " + maxName1);
		System.out.println("Daha uzun isme sahip olan kitap: " + maxName2);
		
		Comparator<Book> comparator3 = (b1, b2) -> b1.getYear() > b2.getYear() ? -1 : 1;
		BinaryOperator<Book> maxYear = BinaryOperator.maxBy(comparator3);
		Book maxYear1 = maxYear.apply(book1, book2);
		Book maxYear2 = maxYear.apply(book3, book4);

		System.out.println("Daha eski olan kitap: " + maxYear1);
		System.out.println("Dahaeski olan kitap: " + maxYear2);
		

	}

}
