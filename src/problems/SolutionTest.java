package problems;

import problems.TreeNode;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SolutionTest {
	
	 TreeNode root = new TreeNode(1);

	@BeforeEach
	void setUp() throws Exception {
		root.right = new TreeNode(3);
		TreeNode sevenNode = new TreeNode(7);
		TreeNode fourNode = new TreeNode(4);
		TreeNode fivNode = new TreeNode(5);		
		TreeNode twoNode = new TreeNode(2);
		fourNode.left = sevenNode;
		twoNode.left = fourNode;
		twoNode.right = fivNode;
		root.left = twoNode;
	}

	@Test
	void test() {
		Solution solution = new Solution();
		System.out.println(solution.deepestLeavesSum(root));
	}

}
