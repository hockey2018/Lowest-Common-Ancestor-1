
import lowestCommonAncestor.Node

public class LowestCommonAncestor {

		// Source:
		// http://www.fusu.us/2013/06/p2-lowest-common-ancestor-in-binary-tree.html
		// Adapted
		public static Node lowestCommonAncestor(Node root, Node a, Node b) {
			if (root == null) {
				return null;
			}

			if (root.equals(a) || root.equals(b)) {
				// if at least one matched, no need to continue
				// this is the LCA for this root
				return root;
			}

			Node l = lowestCommonAncestor(root.getSuccessor1(), a, b);
			Node r = lowestCommonAncestor(root.getSuccessor2(), a, b);

			if (l != null && r != null) {
				return root; // nodes are each on a separate branch
			}

			// either one node is on one branch,
			// or none was found in any of the branches
			return l != null ? l : r;
		}
	}

}
