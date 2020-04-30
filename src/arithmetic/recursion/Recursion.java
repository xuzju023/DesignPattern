package arithmetic.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/11/4 13:49
 * @author: <a href=mailto:xuzj@bonree.com>胥智钧</a>
 * @Description:
 **/
public class Recursion {
    /**
     * 链表反转
     */
    public ListNode reverseList(ListNode head) {
        ListNode node = reverseList(head, null);
        return node;
    }

    public ListNode reverseList(ListNode current, ListNode pre) {
        if (current == null) {
            return null;
        }
        ListNode next = current.next;
        current.next = pre;
        if (next == null) {
            return current;
        }
        return reverseList(next, current);
    }

    /**
     * Fibonacci Number
     * Example 2:
     * <p>
     * Input: 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * You are climbing a stair case. It takes n steps to reach to the top.
     * <p>
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * <p>
     * Note: Given n will be a positive integer.
     * <p>
     * Example 1:
     * <p>
     * Input: 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     * <p>
     * Input: 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     */
    public static int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public static int climb_Stairs(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }

    /**
     *
     *   输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if(listNode!=null){
            deal(listNode,result);
        }

        return result;
    }
    public void deal(ListNode cur, ArrayList<Integer> result){
        if(cur.next!=null){
            deal(cur.next,result);
        }
        result.add(cur.val);
    }



    public static void main(String[] args) {
        //1134903170
        System.out.println(climbStairs(44));
    }
}
