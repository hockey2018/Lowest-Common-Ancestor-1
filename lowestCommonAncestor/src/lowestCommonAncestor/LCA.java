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
	
		private int size(Node x) {
			// returns the number of key valued pairs rooted at x in the BST
			if (x == null) return 0;

			else return x.N;
		}
		
		public boolean contains(Key key) {
			//search BST for a given tree, return true of found or else return false
			return get(key) != null;
		}
		
		private Object get(Key key) {
			// TODO Auto-generated method stub
			return null;
		}


}

