import java.util.Arrays;
public class DirectedAcyclicForm {
	private class Node {
		private Value val;					
		private Node[] successors;			

		public Node(Value val) {
			this.val = val;
		}
	}
}
