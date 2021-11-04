
public class Application 
{
	public static void main(String [] args)
	{
		Tree newTree = new Tree();
		Node rootNode = newTree.generatePracticeTree(3);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Number of nodes traversed: " + DepthFirstSearch.traversal(rootNode));
		
		System.out.println("Height of the tree: " + DepthFirstSearch.findHeight(rootNode));
	}
}
