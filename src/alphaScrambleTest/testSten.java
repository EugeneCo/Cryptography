package alphaScrambleTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import alphaScrambleJava.*;

public class testSten 
{
	
	private AlphabetScramble newInstance;

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
	}

    /*
     * Test that class can be initialised
     */
	@Test
	public void testNewInstance()
	{
		AlphabetScramble newInstance = new AlphabetScramble();
	    assertNotNull(newInstance); 
	}	
	
	/*
	 * Test that default constructor is correct
	 */
	@Test
	public void testDefaultConstructor()
	{
		AlphabetScramble newInstance = new AlphabetScramble();
		assertEquals(28, newInstance.getAlphabetLength());
	}

	/*
	 * Test that all letters return the right number
	 */
	@Test
	public void testLetterReplace()
	{
		AlphabetScramble newInstance = new AlphabetScramble();
		assertEquals("b",newInstance.strSwapLetter("a"));
	}
	

}
