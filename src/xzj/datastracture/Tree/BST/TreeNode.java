package xzj.datastracture.Tree.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	
	public BSTIterator1 iterator1() {
		return new BSTIterator1(this);
	}
	public BSTIterator2 iterator2() {
		return new BSTIterator2(this);
	}
	//迭代器1(基于递归实现)
	public class BSTIterator1 {
		private List<TreeNode> list;
		private int size;
		private int current;
		
		public BSTIterator1(TreeNode root) {
			ArrayList<TreeNode> arrayList = new ArrayList<>();
			inorder(arrayList, root);
			list=arrayList;
			size=arrayList.size();
			current=-1;
		}
		//中序遍历
		public  void inorder(List<TreeNode> list,TreeNode node) {
			if(node==null)
				return;
			inorder(list, node.left);
			list.add(node);
			inorder(list, node.right);
		}

	    /** @return whether we have a next samllest number */
		public boolean hasNext() {
			if(current+1==size) {
				return false;
			}
			return true;
		}

		/** @return the next samllest number */
		public int next() {
			TreeNode node = list.get(current+1);
			current++;
			return node.val;
		}
	}
	
	
	//基于stack栈实现
	public class BSTIterator2 {
		private Stack<TreeNode> stack=new Stack<>();
		/** 初始化迭代器 */
		public BSTIterator2(TreeNode root) {
			  while (root != null) { // 添加元素
				  stack.push(root);
		            root = root.left;
		        }
		}

	    /** @return whether we have a next samllest number */
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		/** @return the next samllest number */
		public int next() {
			TreeNode node = stack.pop();
			int value = node.val;
			if(node.right!=null) {
				node=node.right;
				while(node!=null) {
					stack.push(node);
					node=node.left;
				}
			}
			return value;
		}
	}
}
