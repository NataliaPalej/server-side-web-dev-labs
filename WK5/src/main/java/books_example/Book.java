package books_example;

public class Book {
	
	private String author, title, type;
	private int year;
	
	public Book(String title, String author, int year, String type) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.type = type;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setType(String type) {
		this.type = type;
	}

}
