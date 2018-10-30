import java.util.Arrays;
public class DirectedAcyclicForm {
	private class Node {
		private Value val;					
		private Node[] successors;			

		public Node(Value val) {
			this.val = val;
		}
	}
	@SuppressWarnings("unchecked")
	private Node[] nodeList = new DirectedAcyclicForm.Node[0];

	public boolean isEmpty() { 
		//this is to check if the method is empty 
		if (size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int size() { 
		return nodeList.length;  
		//returns no. of nodes on DAG
	}

	// Checks whether Node n is in the graph.
	public boolean contains(Value v) {
		boolean valInList = false;
		for (int i=0; i<nodeList.length; i++) {
			if (nodeList[i].val == v) {
				valInList = true;
				break;
			}			
		}
		return valInList;
	}
	
		public Node retrieveNodefromVal (Value v){
			//returns a node value as it converts value to a node
			Node nodeToRet = new Node(null); 				
			for (int i=0; i<nodeList.length; i++){
				if (nodeList[i].val == v){
					nodeToRet = nodeList[i];
					break;			
				}	
			}
			return nodeToRet;
		}
		public void put(Value v, Value fromVal, Value toVal) {	
			Node n = new Node(v);
			Node from = retrieveNodefromVal(fromVal);
			Node to = retrieveNodefromVal(toVal);

			if (fromVal != null) {
				from.successors = extendArray(from.successors); 
				from.successors[from.successors.length-1] = n;
				if (from.val == null) {
					addNodeToNodeList(from); 
				}
			}
			if (toVal != null) {
				n.successors = extendArray(n.successors);
				n.successors[n.successors.length-1] = to;
				if (to.val == null) {
					addNodeToNodeList(to);
				}
			}
			addNodeToNodeList(n);	
		}

}
