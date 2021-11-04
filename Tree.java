import java.util.Queue; // import the ArrayList class
import java.util.LinkedList;

public class Tree {
	
	private int height;
	private Node root;
	private Node currentNode;
	
	
	public Tree()
	{
		
		setRoot(new Node(1));
				
	}
	
	/**
	 * @return the root
	 */
	
	public Node getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
		currentNode=root;
	}
	/**
	 * @return the currentNode
	 */
	public Node getCurrentNode() {
		return currentNode;
	}
	/**
	 * @param currentNode the currentNode to set
	 */
	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}
	//returns the root node
	public Node generatePracticeTree(int height)
	{
	   
		
	this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   	childQ.add(pn);
	   	System.out.println ("Root Node value: "+pn.getData());
		int value=pn.getData();
	   	
		 
	   	
	   //Remove the front of the queue
	   //Create its children
	   //Put them in the queue
		 //Data is just parent data+1or 2 depending
	   while (level<(height) && !childQ.isEmpty())
			 {
				 System.out.println("Level is: "+level);
				 for(int i=1;i<=Math.pow(2,(level-1));i++)
				 {
		   		pn=childQ.remove();
				 System.out.println("Parent Node value: "+pn.getData());
				 value++;
				 System.out.println("Adding Left Child: "+(value));
				 pn.setlChild(new Node(value));
				 childQ.add(pn.getlChild());
				 value++;
				 System.out.println("Adding Right Child: "+(value));
				 pn.setrChild(new Node(value));
				 childQ.add(pn.getrChild());
				 }
				 /*pn=childQ.remove();
				 
				 System.out.println("Parent Node value: "+pn.getData());
				 value++;
				 System.out.println("Adding Left Child: "+(value));
				 pn.setlChild(new Node(value));
				 childQ.add(pn.getlChild());
				 value++;
				 System.out.println("Adding Right Child: "+(value));
				 pn.setrChild(new Node(value));
				 childQ.add(pn.getrChild());
				 */
				 level++;System.out.println("Level: "+level);
			 }
			 
		
		return root;
		
	}
}
