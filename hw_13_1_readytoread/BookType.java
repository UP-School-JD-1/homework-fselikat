package hw_13_1_readytoread;

public enum BookType {
	CLASSICS (0),FICTION(1), NON_FICTION(2), SCIENTIFIC(3), HISTORY(4), POETRY(5), ROMANCE(6), HORROR(7),
	ADVENTURE(8), DETECTIVE(9), COMIC_BOOK(10), ENCYCLOPEDIA(11),COOK_BOOK(12),
	PHILOSOPHY(13), RELIGION(14), BIOGRAPHY(15),DIARY(16),ECONOMICS(17), HOBBIES(18);
	int no;
	String description = "These are book genres for readers.";
	BookType (int no){
		this.no=no;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
