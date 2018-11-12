import static org.junit.Assert.*;

import org.junit.Test;

public class DirectedAcyclicFormTest {

	@Test
	public void testForDirectedGraph(){
		DirectedAcyclicForm test = new DirectedAcyclicForm(10);
		test.addEdge(1, 2);
		test.addEdge(1, 3);
		test.addEdge(3, 4);
		test.addEdge(4, 5);
		test.addEdge(4, 6);

		assertEquals("", 1, test.indegree(4));
		assertEquals("", 2, test.outdegree(4));
		assertEquals("", 5, test.E());
		assertEquals("", 10, test.V());
		String ans = "[5, 6]";
		assertEquals("",ans, test.adj(4).toString());
	}
	@Test
	public void testAddEdge(){
		DirectedAcyclicForm test4 = new DirectedAcyclicForm();
		test4.addEdge(0, 1);
		
		//Doesnt add an edge
		test4.addEdge(-2, -5);	
		
		assertEquals("Testing edge count is 1", 1, test4.E());
		
		test4.addEdge(1, 2);
		
		assertEquals("Testing edge count is 2", 2, test4.E());
	}
	@Test
	public void testinDegree(){
		DirectedAcyclicForm test5 = new DirectedAcyclicForm(5);
		assertEquals("", -1, test5.indegree(-3));
	}
	
}
