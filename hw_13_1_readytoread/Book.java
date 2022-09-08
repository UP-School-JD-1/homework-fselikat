package hw_13_1_readytoread;

public class Book {
	Author author;
	String title;
	int page;
	{
		page=0;
	}
	boolean isHardCover;
	int currentPage;
	{
		currentPage=0;
	}
	BookType bookType;
	
	Book(Author author, String title, int page, boolean isHardCover, int currentPage, BookType bookType){
		this.author = author;
		this.title = title;
		this.page = page;
		this.isHardCover = isHardCover;
		this.currentPage = currentPage;
		this.bookType = bookType;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean isHardCover() {
		return isHardCover;
	}

	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	

}
