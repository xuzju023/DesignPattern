package designPattern.datastracture.Tree.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
			/*
	 * Given a binary tree, return the preorder traversal of its nodes' values.
	 * 
	 * Example:
	 * 
	 * Input: [1,null,2,3] 1 \ 2 / 3
	 * 
	 * Output: [1,2,3]
	 */
	//先序遍历递归方式
	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		preorder(root,list);
		return list;
	}
	//先序遍历非递归方式
	public List<Integer> preorderTraversal2(TreeNode root) {
		/*List<Integer> result = new LinkedList<Integer>();
		if (root == null) {
			return result;
		}
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);//压栈
		while (!stack.isEmpty()) {
			TreeNode top = stack.pop();//出栈
			if (top != null) {
				//因为出栈顺序是先进后出，所以先压入右子节点
				result.add(top.val);
				stack.push(top.right);
				stack.push(top.left);
			}
		}*/
		//readable
	    List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;
	}
	//中序迭代方式
	public List<Integer> preorderTraversal3(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				TreeNode top = stack.pop();
				result.add(top.val);
				root = top.right;
			}
		}
		return result;
	}
	
	//后序遍历迭代方式
	public List<Integer> preorderTraversal4(TreeNode root) {
		LinkedList<Integer> ans = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if (root == null) return ans;
		
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			ans.addFirst(cur.val);
			if (cur.left != null) {
				stack.push(cur.left);
			}
			if (cur.right != null) {
				stack.push(cur.right);
			} 
		}
		return ans;
	}
	//层序遍历，DFS深度优先搜索
	public List<List<Integer>> levelTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }
	
//	Given the below binary tree and sum = 22,
//
//		      5
//		     / \
//		    4   8
//		   /    /   \
//		  11  13  4
//		 /  \        \
//		7    2       1
// return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
	public boolean hasPathSum(TreeNode root, int sum) {

		return pathSum(root, sum, 0);
	}

	public boolean pathSum(TreeNode root, int sum, int total) {
		if(root==null) {
			return false;
		}
		total=total+root.val;
		if (root.left==null&&root.right==null) {
			return total==sum;
		}
		return pathSum(root.left, sum, total) || pathSum(root.right, sum, total);
	}

    
    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new LinkedList<Integer>());
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }
    
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        ArrayList<List<Integer>> levelList = new ArrayList<>();
	        int level=0;

	      int leftval=root.left.val;
	      int rightval=root.right.val;
	      
	      if(levelList.get(level)!=null) {
	    	  List<Integer> list = levelList.get(level);
	    	  list.add(leftval);
	    	  list.add(rightval);
	      }else {
	    	  level++;
	    	  ArrayList<Integer> arrayList = new ArrayList<>();
	    	  arrayList.add(leftval);
	    	  arrayList.add(rightval);
	      }
		 return null;
	    }
	
	
	public void preorder(TreeNode root, List list) {
		if(root==null) {
			return;
		}
		list.add(root.val);
		if (null != root.left) {
			preorder(root.left, list);
		}
		if (null != root.right) {
			preorder(root.right, list);
		}
	}

}
