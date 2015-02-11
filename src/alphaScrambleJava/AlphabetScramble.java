package alphaScrambleJava;

import java.util.ArrayList;

public class AlphabetScramble {
	
	private ArrayList<String> listAlphabet = new ArrayList<String>();

	public AlphabetScramble()
	{
		 listAlphabet.add("Start");
		 listAlphabet.add("a");
		 listAlphabet.add("b");
		 listAlphabet.add("c");
		 listAlphabet.add("d");
		 listAlphabet.add("e");
		 listAlphabet.add("f");
		 listAlphabet.add("g");
		 listAlphabet.add("h");
		 listAlphabet.add("i");
		 listAlphabet.add("j");
		 listAlphabet.add("k");
		 listAlphabet.add("l");
		 listAlphabet.add("m");
		 listAlphabet.add("n");
		 listAlphabet.add("o");
		 listAlphabet.add("p");
		 listAlphabet.add("q");
		 listAlphabet.add("r");
		 listAlphabet.add("s");
		 listAlphabet.add("t");
		 listAlphabet.add("u");
		 listAlphabet.add("v");
		 listAlphabet.add("w");
		 listAlphabet.add("x");
		 listAlphabet.add("y");
		 listAlphabet.add("z");
		 listAlphabet.add("End");
		 
	}
	
	/*
	 * Return the length of the alphabet array
	 */
	public int getAlphabetLength() 
	{
		return listAlphabet.size();
	}

	/*
	 * Right Shift the letter
	 */
	public String strSwapLetter(String sLetter)
	{
		for(int i=0; i<=getAlphabetLength(); i++)
		{
			String temp = listAlphabet.get(i);
			if(temp.equalsIgnoreCase(sLetter))
			{
				sLetter = listAlphabet.get(i+1);
				break;
			}		
		}
		return sLetter;
	}
}
