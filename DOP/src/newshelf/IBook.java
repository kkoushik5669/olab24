package newshelf;

public interface IBook {
    public String toString();
    public int hashCode();
};
record Comic(String Title,int ageOfMainCharacter) implements IBook{
    public String getTitle(){
        return this.Title;
    }
    public String toString(){
        return  ("Book Name:"+this.Title+", Age of the Main character:"+this.ageOfMainCharacter);
    }
    public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return this.Title.hashCode()+ageOfMainCharacter;
	}
};
enum FictionType {

	Comedy,
	Tragedy,
	Gok
}
record Fiction(String name) implements IBook {
    private static FictionType f;
	public String getName(){
		return this.name;
	}
	public String toString(){
		return ("Book Name:"+this.name);
	}
	public int hashCode(){
		return name.hashCode();
	}
};
record TextBook(String subject) implements IBook {

	// TODO: Make this a final field with most strict visiibility possible.
	
	// TODO: Change the constructor if required? Correct any errors

	// TODO : create a getter if required.
	public String getSubject(){
		return this.subject;
	}
	// TODO: Create a setter if required
	
	// TODO: write a toString method
	@Override
	public String toString() {
		return ("Subject :"+subject);
	}
	public int hashCode(){
		return subject.hashCode();
	}

}

