package newshelf;


public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Comic) {
			return ((Comic) o).toString();
		}
		if(o instanceof TextBook){
			return o.toString();
		}	
		if(o instanceof Fiction){
			return o.toString();
		}
		return "";
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("LifeSet");
		
	}
}
