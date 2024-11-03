package bonusTest;
import org.junit.Test;
import org.junit.Assert;
import bonus.*;
public class ComicTest{
	public void test1() {
		Comic c = new Comic("SuperMan",25,"SpiderMan");
		Assert.assertTrue(c.printName() == "SuperMan");
	}
	
	public void test2() {
		TextBook t = new TextBook("Biology",5);
		Assert.assertTrue(t.printName() == 5);
	}
}