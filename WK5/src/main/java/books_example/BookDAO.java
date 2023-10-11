package books_example;

import java.util.ArrayList;
import java.util.List;

public enum BookDAO {
	// Set DAO instance
	instance;
	
	// Create list that will store books
	List<Book> bookList;
	
	// Constructor
	private BookDAO() {
		// Create new ArrayList to store Books
		bookList = new ArrayList<Book>();
		
		// Create book objects 
		Book b1 = new Book("Flowers in The Attick", "V. C. Andrews", 1979, "Gothic horror Family saga");
		Book b2 = new Book("Macbeth", "William Shakespeare", 1623, "Tragedy");
		Book b3 = new Book("Balladyna", "Juliusz Slowacki", 1839, "Drama");
		
		// Add books to the list 
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	// Method that returns all book objects
	public List<Book> list(){
		return this.bookList;
	}

	/** 
	 * Method that will save new book in our "database"
	 * It has to be added manually in BookController Servlet class
	 * Method checks if book already exists in list
	 */
	
	public void saveBook(Book b) {
		boolean bookExists = false;
		for (Book book : bookList) {
			if (book.getTitle().equals(b.getTitle())) {
				bookExists = true;
			}
		}
		if (!bookExists){
				bookList.add(b);
		}
	}
}
