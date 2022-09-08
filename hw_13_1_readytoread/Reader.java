package hw_13_1_readytoread;

public class Reader {
	String name;
	int age;
	char sex;
	Book book;
	Reader(String name, int age, char sex,Book book){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.book = book;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void read (Book book){
		int readedPages=5;
		book.setCurrentPage(book.getCurrentPage()+readedPages);
		
		System.out.println(age+" yaşındaki "+name+" isimli "+sex+" okuyucu "+ book.title +" kitabını okuyor ") ;
		
	}

}
