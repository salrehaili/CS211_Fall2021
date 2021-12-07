/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Singly Linked List

class Node{
	private Object value;	// Holds the data of the node
	public Node left;		// Holds the follwoing left node's address
	public Node right;		// Holds the follwoing right node's address

	Node(Object v){
		this.value =v;
		this.left = this.right = null;
	}

	public Node getLeft(){
		return this.left;
	}
	public Node getRight(){
		return this.right;
	}

	public Object getValue(){
		return this.value;
	}

	

	public void setValue(Object v)
	{
		this.value=v;
	}
}

class BinaryTree{
	public Node root;			// Root of Binary Tree


	BinaryTree(Object v){
		this.root = new Node(v);
	}
	BinaryTree(){
		this.root = null;
	}


	public void display(Node root, int margin, char f)
	{
		int kWidth = 5;
  		if (root==null)
  			return;

  		//margin += kWidth;
  		// Process right child first
  		display(root.right, margin + 1, 'r');
  		// Print the current node after space
  		//System.out.print("\n");
  		//for (int i = 0; i < margin * kWidth; ++i)
  			System.out.printf("\n%"+margin*kWidth +"s", " ");
  		
  		if(f=='r')
  			System.out.printf("┌─%d──│\n", root.getValue());
  		else if(f=='l')
  			System.out.printf("└─%d──│\n", root.getValue());
  		else
  			System.out.printf("%d────│\n", root.getValue());
  		
  		display(root.left, margin +1, 'l');
	}
	public void PLR(Node root) {
		if (root == null)
			return;
		System.out.printf("%s ", root.getValue());
		PLR(root.left);
		PLR(root.right);
	}
	
	public void LPR(Node root) {
		if (root == null)
			return;
		
		PLR(root.left);
		System.out.printf("%s ", root.getValue());
		PLR(root.right);
	}
	public void LRP(Node root) {
		if (root == null)
			return;
		
		PLR(root.left);
		PLR(root.right);
		System.out.printf("%s ", root.getValue());
	}

	
}

public class Test_BinaryTree{
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        //tree.root.left.right = new Node(5);



        //System.out.println(tree.root.right.getValue());

        tree.display(tree.root, 1, 'c');
        //tree.PrintTree(tree.root, 1);

        tree.LRP(tree.root);
        System.out.println();
	}
}


