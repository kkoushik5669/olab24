package oldshelf;

public abstract class Book {
	String title;
	public Book() {
		// TODO: Finish Code here if anything to be done?
		this.title="";
	}
	public String toString() {
		return ("Book Name:"+title);
	}
	public int hashCode(){
		return title.hashCode();
	}
}
