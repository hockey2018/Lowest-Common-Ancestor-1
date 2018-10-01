package lowestCommonAncestor;

import org.w3c.dom.Node;

public class LCA <Key extends Comparable<Key>, Value>{
	Node root; 
	//this is the class for the lowest common ancestor 
	class Node {
		private Key key;           				
		private Value val;         				
		private Node left, right; 				
		private int N;             				

		public Node(Key key, Value val, int N) {
			this.key = key;
			this.val = val;
			this.N = N;
		}

	}
	public boolean isEmpty() { 
		return size() == 0; 
	}
	private int size() {
		return size(); //root
		
	}

}

