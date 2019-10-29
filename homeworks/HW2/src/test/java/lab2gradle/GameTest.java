package lab2gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
	
	String word1 = "atom";
	String word2 = "toma";
	String word3 = "mato";
	String word4 = "agmo";
	String word5 = "bbbb";
	
	@Test
	public void testBullMethod()
	{
		assertEquals(4, Game.bull(word1, word1));
		assertEquals(0, Game.bull(word1, word2));
		assertEquals(0, Game.bull(word1, word3));
		assertEquals(1, Game.bull(word1, word4));
		assertEquals(1, Game.bull(word1, word5));
	}
	
	@Test
	public void testCowMethod()
	{
		assertEquals(4, Game.bull(word1, word1));
		assertEquals(4, Game.bull(word1, word2));
		assertEquals(4, Game.bull(word1, word3));
		assertEquals(3, Game.bull(word1, word4));
		assertEquals(0, Game.bull(word1, word5));
	}
}
