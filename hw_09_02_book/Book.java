package hw_09_02_book;

public class Book {
	String name;
	String author;
	int year;
	int page;
	public Book(){
		
	}
	public Book(String name,String author,int year,int page){
		this.name=name;
		this.author=author;
		this.year=year;
		this.page=page;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", year=" + year + ", page=" + page + "]";
	}
	


}
