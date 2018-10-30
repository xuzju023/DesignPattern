package xzj.datastracture.Tree.BST;

import java.util.ArrayList;
import java.util.List;

public class BSTsolution {
	//验证是否为二分查找树
	public static boolean isValidBST(TreeNode root) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		inorder(arrayList, root);
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size()-1; i++) {
			if(arrayList.get(i)>=arrayList.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	//中序遍历
	public static void inorder(List<Integer> list,TreeNode node) {
		if(node==null)
			return;
		inorder(list, node.left);
		list.add(node.val);
		inorder(list, node.right);
	}
}
