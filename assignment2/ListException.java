package assignment2;

public class ListException extends Exception
{
	String msg;
	
	//Constructor
	public ListException(String m)
	{
		msg = m;
	}
	
	//Return msg
	public String toString()
	{
		return msg;
	}
}
