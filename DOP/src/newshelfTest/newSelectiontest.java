package newShelfTest;
import org.junit.Test;
import newshelf.*;
import org.junit.Assert;
public class newSelectiontest{
	public void testGetAgeOrTitle1() {
		Comic c = new Comic("SuperMan",26);
		Assert.assertTrue(NewSelection.getAgeOrTitle(c) == "Spiderman");
	}
	public void testGetAgeOrTitle2() {
		Comic c = new Comic("SuperMan",22);
		Assert.assertFalse(NewSelection.getAgeOrTitle(c) == "Name");
	}
}