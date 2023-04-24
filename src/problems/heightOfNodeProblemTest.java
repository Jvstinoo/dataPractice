package problems;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class heightOfNodeProblemTest {
	
	TreeNode root;
	TreeNode L;
	TreeNode R;
	TreeNode leftL;
	TreeNode rightL;

	@BeforeEach
	void setUp() throws Exception {
		root = new TreeNode(1);
		L = new TreeNode(2);
		R = new TreeNode(3);
		leftL = new TreeNode(4);
		rightL = new TreeNode(5);
		L.left = leftL;
		L.right = rightL;
		root.left = L;
		root.right = R;
	}

	@Test
	void test() {
		heightOfNodeProblem sol = new heightOfNodeProblem();
		
		System.out.println(sol.heightOfNode(root, 5));
		System.out.println(sol.heightOfNode(root, 1));
		assertTrue("height of node 1", sol.heightOfNode(root, 1) == 2);
		assertTrue("height of node 2 and 3", sol.heightOfNode(root, 2) == 1 && sol.heightOfNode(root, 3) == 0);
		assertTrue("height of node 5", sol.heightOfNode(root, 5) == 0);
	}

}
