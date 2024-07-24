package Week1Day2;

	public class Library {

	
	    public String addBook(String bookTitle) {
	    	
	        System.out.println("Book added successfully");
	        return bookTitle; 
	    }

	 
	    public void issueBook() {
	        System.out.println("Book issued successfully");
	    }

	    public static void main(String[] args) {
	    
	        Library library = new Library();

	       
	      System.out.println((library.addBook("Wings of Fire"))); 
	    

	        library.issueBook();
	    }
	}


