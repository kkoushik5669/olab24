package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String title) {
		super();
		this.name=title;
		// TODO  correct the above.
	}
	public String getName(){
		return this.name;
	}
	public String toString(){
		return ("Book Name:"+this.name);
	}
	public int hashCode(){
		return name.hashCode();
	}
}
