package xzj.datastracture.Tree.BST;

import org.junit.Test;

import xzj.datastracture.Tree.BST.TreeNode.BSTIterator1;
import xzj.datastracture.Tree.BST.TreeNode.BSTIterator2;

public class BSTtest {
	/*  5
	   / \
	  1   8
	     / \
	     7  9*/
		/*TreeNode root= new TreeNode(5);
		root.left=new TreeNode(1);
		TreeNode right = new TreeNode(8);
		root.right=right;
		right.left=new TreeNode(7);
		right.right=new TreeNode(9);*/
	//验证是否为二叉搜索树
	@Test
	public void test1() throws Exception {
		TreeNode root= new TreeNode(5);
		root.left=new TreeNode(1);
		TreeNode right = new TreeNode(8);
		root.right=right;
		right.left=new TreeNode(7);
		right.right=new TreeNode(9);
		BSTsolution.isValidBST(root);
	}
	//迭代器1
	@Test
	public void test2() throws Exception {
		TreeNode root= new TreeNode(5);
		root.left=new TreeNode(1);
		TreeNode right = new TreeNode(8);
		root.right=right;
		right.left=new TreeNode(7);
		right.right=new TreeNode(9);
		BSTIterator1 iterator = root.iterator1();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	//迭代器2
	@Test
	public void test3() throws Exception {
		TreeNode root= new TreeNode(5);
		root.left=new TreeNode(1);
		TreeNode right = new TreeNode(8);
		root.right=right;
		right.left=new TreeNode(7);
		right.right=new TreeNode(9);
		BSTIterator2 iterator = root.iterator2();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
