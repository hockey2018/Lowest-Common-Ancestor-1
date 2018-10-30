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
}
