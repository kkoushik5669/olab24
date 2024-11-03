package oldSelectionTest;
import org.junit.Assert;
import org.junit.Test;
import oldshelf.*;
public class oldSelectionTest {
    public void testGetAgeOrTitle2() {
        Comic c = new Comic("SuperMan",26);
        Assert.assertFalse(OldSelection.getAgeOrTitle(c) == "Name");
    }
	public void testGetAgeOrTitle1() {
		Comic c = new Comic("SuperMan",45);
		Assert.assertTrue(OldSelection.getAgeOrTitle(c) == "Spiderman");
	}
}
