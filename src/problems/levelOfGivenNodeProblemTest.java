package problems;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class levelOfGivenNodeProblemTest {
	
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
		levelOfGivenNodeProblem sol = new levelOfGivenNodeProblem();
		
		System.out.println(sol.levelOfGivenNode(root, R));
		System.out.println(sol.levelOfGivenNode(root, root));
		TreeNode fourNode = new TreeNode(4);
		assertTrue("Failed to return level 3 on Nodes with values 4 and 5", sol.levelOfGivenNode(root, fourNode) == 3);
	}

}
