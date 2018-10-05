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
		
		
		// return the median key or null if it is empty
		public Key median() {
			if (isEmpty()) return null; //returning null if the bst is empty

			else {
				int median=(((size(root)+1)/2)-1);   //add 1 to size(root)	
				//need to change int to key?
				return intToKey(median);
			}
		}
		private Key intToKey(int median) {
			// TODO Auto-generated method stub
			return null;
		}

	
		private Node intToKey(Node node, int passedInt) {     
			int leftSize = (size(node.left));  
			
			//to find the node with the right key passed into it, check whether it is in the left or right subtree
			if (leftSize > passedInt) {
				return intToKey(node.left,  passedInt); 
			}
			else if (leftSize < passedInt) {
				return intToKey(node.right, passedInt-leftSize-1); 
			}
			else {
				return node; 
			}
			
			
			//public String printKeysInOrder() {
				//this will print out a string with all the keys in order with parenthisis
				//String res= "";
				//if (isEmpty()){
				//	return res += "()";
				//}
				//else {
				//	return res = printKeysInOrder(root);
			//	}
			
			}
		//} 
		 private String printKeysInOrder(Node node) {
			 String res = "";
			 if (node == null) {
				 return res += "()";
			 }
			 
			 else {
				return res += ("(" + printKeysInOrder(node.left) + node.key.toString() + printKeysInOrder(node.right) + ")");
			 }
			 
		 }
		 
		 public String prettyPrintKeys() {
			 //print each node in the tree
				if(isEmpty()) return "-null\n";
			     return prettyPrint(root,"");
			}
		 private String prettyPrint(Node node, String prefix) {
				if (node == null) {
					return (prefix + "-null\n");
				}
				else {
					
					return (prefix+"-"+node.key.toString()+"\n" +prettyPrint(node.left,(prefix+" |"))+ prettyPrint(node.right,(prefix+"  ")));
		    	}
				
			}
		 
		 public void delete1(Key key) {
			 //should delete the key
		 
				root = delete(root, key);	
			}
			
			private Node delete (Node node, Key key) {
				if (node == null) { 
					return null;
				}
				 int compare = key.compareTo(node.key);
			        
			        if   (compare > 0) {
			        	node.right = delete(node.right, key);
			        	node.left  = delete(node.left,  key);
			        }
			        else if (compare < 0) {
			        	node.left  = delete(node.left,  key);
			        }
			        else {
			        	if (node.right == null) {
			        		return node.left;
			        	}
			            if (node.left  == null) {
			            	return node.right;
			            }
			            Node temp = node;
			            node = max(temp.left);                              
			            node.left = deleteMax(temp.left);                 
			            node.right = temp.right; 
			        }
			        
			        node.N = size(node.left) + size(node.right) + 1;
			        return node;
					
				}
				
			private Node deleteMax(Node node) 
		    {
		        if (node.right == null) return node.left;
		        node.right = deleteMax(node.right);
		        node.N = size(node.left) + size(node.right) + 1;                                 
		        return node;
		    }
			
			public Node max(Node node)
			   {
			     if(node.right!=null) {
			       return max(node.right);
			     }
			     return node;
			   }
				
			}

