package assignment2;

public class NodeCounter
{
	public static int nodeCounter(Node node)
	{
		if(node == null)
			return 0;
		else
		{
			if(node.getNext() == null)
				return 1;
			else
				return 1 + nodeCounter(node.getNext());
		}
	}
}
