package hw_13_1_readytoread;

public class ReaderTest {

	public static void main(String[] args) {
		Author author1 = new Author("Jack LONDON");
		Author author2 = new Author("Agatha CHRISTIE");
		Book book1 = new Book(author1,"MARTIN EDEN",520,false,20,BookType.FICTION);
		Book book2 = new Book(author2,"10 Küçük Zenci",224,true,0,BookType.DETECTIVE);
		Book book3 = new Book(author2,"Doğu Ekspresinde Cinayet",256,true,99,BookType.DETECTIVE);
		Reader reader1 = new Reader ("Gamze",25,'K',book1);
		Reader reader2 = new Reader ("Afra",13,'K',book2);
		Reader reader3 = new Reader ("Selim",49,'E',book3);
		System.out.println("current page: "+book1.getCurrentPage());
		reader1.read(book1);
		System.out.println("current page: "+book1.getCurrentPage());
		reader2.read(book2);
		reader3.read(book3);


	}

}
