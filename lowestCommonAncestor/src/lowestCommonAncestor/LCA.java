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
		
		public Value get(Key key) { 
			return get(root, key); 
		}
		private Value get(LCA<Key, Value>.Node root2, Key key) {
			// TODO Auto-generated method stub
			return null;
		}

	
		public void put(Key key, Value val) {
			//insert key value pair into BST, if it already exists update it 
			if (val == null) { 
				delete(key); return; 
				}
				root = put(root, key, val);
		}
		
		
	
	
		
		private void delete(Key key) {
			// TODO Auto-generated method stub
			
		}
		private Node put(Node node, Key key, Value val) {
			if (node == null) return new Node(key, val, 1); //new bst
			int cmp = key.compareTo(node.key);
			if      (cmp < 0) node.left  = put(node.left,  key, val);
			else if (cmp > 0) node.right = put(node.right, key, val);
			else              node.val   = val; //updating value
			node.N = 1 + size(node.left) + size(node.right); // value child1 + value child2 + 1
			return node;
		}
		
		//tree height- asymptopic worst case running time

		public int height() { 
			return height(root); 
		}
	
		
		private int height(Node x) {
			if (x == null) {
				return -1;
			}
			else {
				return 1 + Math.max(height(x.left), height(x.right));
			}
		}

}

