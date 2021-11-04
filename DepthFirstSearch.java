
public class DepthFirstSearch 
{
	static int index = 0;
	
	static int traversal(Node node)
	{
		if(node != null)
		{
			System.out.println(node.getData());
			DepthFirstSearch.index++;
			traversal(node.getlChild());
			traversal(node.getrChild());
		}
		return index;
	}
	
	public static int findHeight(Node node)
	{	
		if(node != null)
		{
			int leftChildHeight = findHeight(node.getlChild());
			int rightChildHeight = findHeight(node.getrChild());
			
			return 1 + Math.max(leftChildHeight, rightChildHeight);
			
		} else {
			return 0;
		}
	}
}
