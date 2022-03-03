package com.progs;

class BugException extends Exception

{
	public BugException(String message) {
		super(message);
	}
}
public class Program1 {
	
	public int solution (String input) throws BugException
	
	// WAP to find sum of digits passed as input.
	//If any special character is found raise an exception
	//called BugFound with message "Invaild Character".
	{
		int sum = 0;  
		for(char c:input.toCharArray())
		{
			if(!(Character.isLetterOrDigit(c)))
				throw new BugException("Invaild Character");
			else if(Character.isDigit(c))
				sum=sum+Character.getNumericValue(c);
		}
			
		
		
		return sum;  
	}

}

