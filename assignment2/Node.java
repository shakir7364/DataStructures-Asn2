package assignment2;

public class Node 
{
	private Node next;
	
	//Constructor
	public Node()
	{
		next = null;
	}
	
	//Set the next variable to a node
	public void setNext(Node n)
	{
		next = n;
	}
	
	//Return next
	public Node getNext()
	{
		return next;
	}
}
