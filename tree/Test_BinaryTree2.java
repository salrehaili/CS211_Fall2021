/*
 * Fall 2021
 * CS211-Algorithm & Data Structures
 * Dr. Sameer M. Alrehaili
*/

//Binary Tree

class Node{
	private Object value;	// Holds the data of the node
	public Node left;		// Holds the follwoing left node's address
	public Node right;

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
	public Node root;
	BinaryTree(){
		this.root=null;
	}

	BinaryTree(Object v){
		this.root=null;
		this.root = new Node(v);
	}
	
	public void display(Node root, int margin, char f){
		int k=5;
		if(root==null)
			return;

		display(root.right, margin +1, 'r');

		// System.out.println();
		// for(int i=0;i<margin*k;i++)
		// 	System.out.print(" ");
		System.out.printf("%"+margin*k+"s", " ");

		if(f=='r')
			System.out.printf("┌─%d──│\n", root.getValue());
		else if(f=='l')
			System.out.printf("└─%d──|\n", root.getValue());
		else
			System.out.printf("%d────│\n", root.getValue());

		display(root.left, margin +1, 'l');

	}

	public void insert(Node curr, Object source, Object destination){
		if(curr == null && this.root == null)
		{
			this.root = new Node(source);
			this.root.left = new Node(destination);
		}
		else if(curr.getValue() == source)
		{
			if(curr.left == null)
				curr.left = new Node(destination);
			else
				curr.right = new Node(destination);
		}
		
		if(curr !=null){
			if (curr.left != null)
				insert(curr.left, source, destination);
			if (curr.right != null)
				insert(curr.right, source, destination);
		}
		

	}



	public void PLR(Node root){
		if(root==null)
			return;
		System.out.printf("%s ", root.getValue());
		PLR(root.left);
		PLR(root.right);
	}
	public void LPR(Node root){
		if(root==null)
			return;
		
		PLR(root.left);
		System.out.printf("%s ", root.getValue());
		PLR(root.right);
	}

public void LRP(Node root){
		if(root==null)
			return;
		
		PLR(root.left);
		PLR(root.right);
		System.out.printf("%s ", root.getValue());
	}
	

}
public class Test_BinaryTree2{
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		// tree.root = new Node(1);
		// tree.root.left = new Node(2);
		// tree.root.right = new Node(3);
		// tree.root.left.left = new Node(4);

		// tree.root.left.left.left = new Node(8);
		// tree.root.left.left.right = new Node(9);

		// tree.root.left.right = new Node(5);

		// tree.root.left.right.left = new Node(10);

		// tree.root.left.right.right = new Node(11);

		// tree.root.right.left = new Node(6);
		// tree.root.right.left.right = new Node(13);
		// tree.root.right.right = new Node(7);
		// tree.root.right.right.left = new Node(14);



		tree.insert(tree.root, 1,2);
		tree.insert(tree.root, 1,3);
		tree.insert(tree.root, 2,4);
		tree.insert(tree.root, 2,5);
		tree.insert(tree.root, 4,8);
		tree.insert(tree.root, 4, 9);
		tree.insert(tree.root, 5, 10);
		tree.insert(tree.root,5, 11);
		tree.insert(tree.root, 3, 6);
		tree.insert(tree.root, 3,7);
		tree.insert(tree.root, 6,13);
		tree.insert(tree.root, 7,14);

		
		//System.out.println(tree.root.getValue());
		tree.display(tree.root, 1, 'c');

		tree.PLR(tree.root);	// pr-eorder
		System.out.println();

		tree.LPR(tree.root);	// in-order
		System.out.println();

		tree.LRP(tree.root); //post-order
		System.out.println();

	}


}


