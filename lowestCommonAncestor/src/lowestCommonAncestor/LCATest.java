package lowestCommonAncestor;

public class LCATest {

public void testLCA() {
		
		LCA<Integer, Integer> bst = new LCA<Integer, Integer>();
		
		assertSame("Testing LCA for null root", null, bst.lowestCommonAncestor(bst.root, 1, 2));
		
		bst.put(7, 7);   
		bst.put(8, 8);   
		bst.put(3, 3);   
		bst.put(1, 1);   
		bst.put(2, 2);   
		bst.put(6, 6);   
		bst.put(4, 4);   
		bst.put(5, 5);   
		
		assertSame("Testing LCA left side", 3, bst.lowestCommonAncestor(bst.root, 2,6));
		assertSame("Testing LCA right side", 7, bst.lowestCommonAncestor(bst.root, 8,3));
		assertSame("Testing LCA where LCA is one of the nodes", 7, bst.lowestCommonAncestor(bst.root, 7,8));
	}

private void assertSame(String string, Object object, Integer lowestCommonAncestor) {
	// TODO Auto-generated method stub
	@Test
	public void testPrettyPrint() {
		LCA<Integer, Integer> LCA = new LCA<Integer, Integer>();
		assertEquals("Checking pretty printing of empty tree",
				"-null\n", LCA.prettyPrintKeys());

		
		LCA.put(7, 7);      //building
		LCA.put(8, 8);      //testing to send to git  test to send to hh22fjjjjjjjj
		LCA.put(3, 3);    
		LCA.put(1, 1);      
		LCA.put(2, 2);      
		LCA.put(6, 6);       
		LCA.put(4, 4);      
		LCA.put(5, 5);       
		

		String result = 
				"-7\n" +
						" |-3\n" + 
						" | |-1\n" +
						" | | |-null\n" + 
						" | |  -2\n" +
						" | |   |-null\n" +
						" | |    -null\n" +
						" |  -6\n" +
						" |   |-4\n" +
						" |   | |-null\n" +
						" |   |  -5\n" +
						" |   |   |-null\n" +
						" |   |    -null\n" +
						" |    -null\n" +
						"  -8\n" +
						"   |-null\n" +
						"    -null\n";
		assertEquals("Checking pretty printing of non-empty tree", result, LCA.prettyPrintKeys());


	}
	@Test
	public void testDelete() {
		LCA<Integer, Integer> LCA = new LCA<Integer, Integer>();
		LCA.delete(1);
		assertEquals("Deleting from empty tree", "()", LCA.printKeysInOrder());

		LCA.put(7, 7);   
		LCA.put(8, 8);   
		LCA.put(3, 3);   
		LCA.put(1, 1);  
		LCA.put(2, 2); 
		LCA.put(6, 6); 
		LCA.put(4, 4);   
		LCA.put(5, 5);   
		

		assertEquals("Checking order of constructed tree",
				"(((()1(()2()))3((()4(()5()))6()))7(()8()))", LCA.printKeysInOrder());

		LCA.delete(9);
		assertEquals("Deleting non-existent key",
				"(((()1(()2()))3((()4(()5()))6()))7(()8()))", LCA.printKeysInOrder());

		LCA.delete(8);
		assertEquals("Deleting leaf", "(((()1(()2()))3((()4(()5()))6()))7())", LCA.printKeysInOrder());

		LCA.delete(6);
		assertEquals("Deleting node with single child",
				"(((()1(()2()))3(()4(()5())))7())", LCA.printKeysInOrder());

		LCA.delete(3);
		assertEquals("Deleting node with two children",
				"(((()1())2(()4(()5())))7())", LCA.printKeysInOrder());
	}
	@Test
	public void testDelete() {
		LCA<Integer, Integer> LCA = new LCA<Integer, Integer>();
		LCA.delete(1);
		assertEquals("Deleting from empty tree", "()", LCA.printKeysInOrder());

		LCA.put(7, 7);   
		LCA.put(8, 8);   
		LCA.put(3, 3);  
		LCA.put(1, 1); 
		LCA.put(2, 2);  
		LCA.put(6, 6);  
		LCA.put(4, 4);  
		LCA.put(5, 5); 
		

		assertEquals("Checking order of constructed tree",
				"(((()1(()2()))3((()4(()5()))6()))7(()8()))", LCA.printKeysInOrder());

		LCA.delete(9);
		assertEquals("Deleting non-existent key",
				"(((()1(()2()))3((()4(()5()))6()))7(()8()))", LCA.printKeysInOrder());

		LCA.delete(8);
		assertEquals("Deleting leaf", "(((()1(()2()))3((()4(()5()))6()))7())", LCA.printKeysInOrder());

		LCA.delete(6);
		assertEquals("Deleting node with single child",
				"(((()1(()2()))3(()4(()5())))7())", LCA.printKeysInOrder());

		LCA.delete(3);
		assertEquals("Deleting node with two children",
				"(((()1())2(()4(()5())))7())", LCA.printKeysInOrder());
	}


	}
}
