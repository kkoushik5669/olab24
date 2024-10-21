package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ private final String Title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String Title,int ageOfMainCharacter) {
		super();
		this.Title=Title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}
	
	// TODO : create a getter if required.
	public String getTitle(){
		return this.Title;
	}
	public int getAgeofMainCharacter(){
		return this.ageOfMainCharacter;
	}
	// TODO: Create a setter if required
	
	// TODO: write a toString method
	@Override
	public String toString() {
		return  ("Book Name:"+this.Title+", Age of the Main character:"+this.ageOfMainCharacter);
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return this.Title.hashCode()+ageOfMainCharacter;
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		return hashCode()==o.hashCode();
	}
}
