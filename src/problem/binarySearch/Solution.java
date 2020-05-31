package problem.binarySearch;

import designPattern.datastracture.Tree.BST.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution  extends GuessGame {
//		Example 1:
//
//		Input: nums = [-1,0,3,5,9,12], target = 9
//		Output: 4
//		Explanation: 9 exists in nums and its index is 4
//	
//		Example 2:
//
//	    Input: nums = [-1,0,3,5,9,12], target = 2
//			Output: -1
//			Explanation: 2 does not exist in nums so return -1
//		Note:
//
//		You may assume that all elements in nums are unique.
//		n will be in the range [1, 10000].
//		The value of each element in nums will be in the range [-9999, 9999].

	public static int search(int[] nums, int target) {
		int beginIndex = 0;
		int endIndex = nums.length - 1;
		if(endIndex==0) {
			return nums[0]==target?0:-1;
		}
		 if(nums[0]==target) {
				return 0;
			}
			if(nums[1]==target) {
				return 1;
			}
			return search2(nums, target, beginIndex, endIndex);
	}
	static int search2(int[] nums, int target,int beginIndex,int endIndex) {
		int midIndex=(beginIndex+endIndex)/2;
		if(nums[midIndex]==target) {
			return midIndex;
		}
		if(midIndex==beginIndex||midIndex==endIndex) {
			return -1;
		}
		if (nums[midIndex] > target) {
			endIndex=midIndex;
			return search2(nums, target, beginIndex, endIndex);
		}else {
			beginIndex=midIndex;
			return search2(nums, target, beginIndex, endIndex);
		}

	}
//	Example 1:
//
//		Input: 4
//		Output: 2
//		Example 2:
//	Example 2:
//		Input: 8
//		Output: 2
//		Explanation: The square root of 8 is 2.82842..., and since 
//		             the decimal part is truncated, 2 is returned.
	public static int mySqrt(int x) {
		if(x==0||x==1) {
			return x;
		}
		int begin=0;
		int end= x;
		while(end>begin) {
			int mid=(end+begin)/2;
			if(mid>x/mid) {
				end=mid-1;
			}else {
				if ((mid+1)>x/(mid+1)) {
					return mid;
				}
				begin=mid+1;
			}
		}
		return x;
	}
	
	public static int sqrt(int x) {
	    if (x == 0)
	        return 0;
	    int left = 1, right = Integer.MAX_VALUE;
	    while (true) {
	        int mid = left + (right - left)/2;
	        if (mid > x/mid) {
	            right = mid - 1;
	        } else {
	            if (mid + 1 > x/(mid + 1))
	                return mid;
	            left = mid + 1;
	        }
	    }
	}
//	We are playing the Guess Game. The game is as follows:
//
//		I pick a number from 1 to n. You have to guess which number I picked.
//
//		Every time you guess wrong, I'll tell you whether the number is higher or lower.
//
//		You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
//
//		-1 : My number is lower
//		 1 : My number is higher
//		 0 : Congrats! You got it!
//		Example :
//
//		Input: n = 10, pick = 6
//		Output: 6
	public static int guessNumber(int n) {
        int begin=1;
        int end=n;
        while(end>begin) {
        	int mid=begin+(end-begin)/2;
        	if(guess(mid)==0) {
        		return mid;
        	}
        	if(guess(mid)==-1) {
        		end=mid-1;
        	}
        	if(guess(mid)==1) {
        		begin=mid+1;
        	}
        }
		return begin;
    }

//	Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//	(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
//
//	You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//	You may assume no duplicate exists in the array.
//
//	Your algorithm's runtime complexity must be in the order of O(log n).
//
//	Example 1:
//
//	Input: nums = [4,5,6,7,0,1,2], target = 0
//	Output: 4
//	Example 2:
//
//	Input: nums = [4,5,6,7,0,1,2], target = 3
//	Output: -1
    public static int search3(int[] nums, int target) {
		int begin = 0;
		int end = nums.length - 1;
		while (end >=begin) {
			int mid = (begin + end) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] > nums[end]) {
				if (target < nums[mid]&&target>=nums[begin]) {
					end = mid - 1;
				} else {
					begin = mid + 1;
				}
			} else {
				if (target > nums[mid]&&nums[end]>=target) {
					begin = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
    }
//    You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
//
//    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
//
//    You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
//
//    Example:
//
//    Given n = 5, and version = 4 is the first bad version.
//
//    call isBadVersion(3) -> false
//    call isBadVersion(5) -> true
//    call isBadVersion(4) -> true
//
//    Then 4 is the first bad version. 
	public static int firstBadVersion(int n) {
		int begin=1;
		int end =n;
		while(end>begin){
			int mid=begin+(end-begin)/2;
			
			if(isBadVersion(mid)) {
				end=mid;
			}else {
				begin=mid+1;
			}
		}
		return end;
	}
	static boolean isBadVersion(int version) {
		if(version==2) {
			return true;
		}else {
			return false;
		}
	}






//		Example 1:
//
//		Input: nums = [1,2,3,1]
//		Output: 2
//		Explanation: 3 is a peak element and your function should return the index number 2.
//		Example 2:
//
//		Input: nums = [1,2,1,3,5,6,4]
//		Output: 1 or 5 
//		Explanation: Your function can return either index number 1 where the peak element is 2, 
//		             or index number 5 where the peak element is 6.
	public  static int findPeakElement(int[] nums) {
		int begin = 0;
		int end = nums.length - 1;
		if(end==1) {
			return nums[1]>nums[0]?1:0;
		}
		while (end > begin) {
			int mid = (end+begin) / 2;
			if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
				begin = mid;
			} else if (nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]) {
				end = mid;
			} else {
				return mid;
			}
		}

		return 0;
	}

//	Find Minimum in Rotated Sorted Array
//	  Go to Discuss
//	Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//	(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//
//	Find the minimum element.
//
//	You may assume no duplicate exists in the array.
//
//	Example 1:
//
//	Input: [3,4,5,1,2] 
//	Output: 1
//	Example 2:
//
//	Input: [4,5,6,7,0,1,2]
//	Output: 0
	
    public int findMin(int[] nums) {
    	int begin=0;
    	int end=nums.length-1;

    	while(end>begin) {
    		int mid=(begin+end)/2;
    		if(nums[mid]>nums[end]) {
    			begin=mid+1;
    		}else {
    			if((mid-1)>=0&&nums[mid]<nums[mid-1]) {
    				return nums[mid];
    			}else {
    				end=mid;
    			}
    		}
    	}
    	return nums[end];
    }


//    Search for a Range
//    Go to Discuss
//  Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//  Your algorithm's runtime complexity must be in the order of O(log n).
//
//  If the target is not found in the array, return [-1, -1].
//
//  Example 1:
//
//  Input: nums = [5,7,7,8,8,10], target = 8
//  Output: [3,4]
//  Example 2:
//
//  Input: nums = [5,7,7,8,8,10], target = 6
//  Output: [-1,-1]
    public static int[] searchRange(int[] nums, int target) {
    	int begin=0;
    	int end =nums.length-1;
        while(end>=begin) {
        	int mid=(begin+end)/2;
        	if(nums[mid]==target) {
        		int left=mid;
        		int right=mid;
        		while(++right<=end) {
        			if(target==nums[right]) {
        			}else {
        				break;
        			}
        		}
        		while(--left>=begin) {
        			if(target==nums[left]) {
        			}else {
        				break;
        			}
        		}
        		return new int[] {left+1,right-1};
        	}
        	if(nums[mid]>target) {
        		end=mid-1;
        	}
        	if(nums[mid]<target) {
        		begin=mid+1;
        	}
        }
    	return new int[] {-1,-1};
    }
//    Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
//
//    Example 1:
//    Input: [1,2,3,4,5], k=4, x=3
//    Output: [1,2,3,4]
//    Example 2:
//    Input: [1,2,3,4,5], k=4, x=-1
//    Output: [1,2,3,4]
//    Note:
//    The value k is positive and will always be smaller than the length of the sorted array.
//    Length of the given array is positive and will not exceed 10^4
//    Absolute value of elements in the array and x will not exceed 10^4
	//解法一:实际上相当于在长度为n的数组中去掉n-k个数字，而且去掉的顺序肯定是从两头开始去，因为距离x最远的数字肯定在首尾出现。那么问题就变的明朗了，每次比较首尾两个数字跟x的距离，将距离大的那个数字删除，直到剩余的数组长度为k为止
	//解法二:二分搜索,在目标数组是个连续的区间。目标数组最小值lo必然落在arr.size()-k这段区间上。lo左边点到x的距离必然>lo+k的距离,反之lo右边点到x的距离必然<lo+k到x的距离
   public static List<Integer> findClosestElements(int[] arr, int k, int x) {
	   List<Integer> list = new ArrayList<>();
	   for (int num: arr){
		   list.add(num);
	   }
	   int lo = 0, hi = list.size() - k;
	   while (lo < hi) {
		   int mid = (lo + hi) / 2;
		   if (x - list.get(mid) > list.get(mid+k) - x)
			   lo = mid + 1;
		   else
			   hi = mid;
	   }
	   return list.subList(lo, lo + k);
    }
//	Given a positive integer num, write a function which returns True if num is a perfect square else False.
//
//	Note: Do not use any built-in library function such as sqrt.
//
//	Example 1:
//
//	Input: 16
//	Output: true
//	Example 2:
//
//	Input: 14
//	Output: false
	public static boolean isPerfectSquare(int num) {
		int begin=1;
		int end=num;
		while(end>begin){
			int mid=begin+((end-begin)>>1);
			if(mid*mid==num){
				return true;
			}
			if(mid>num/mid){
				end=mid;
			}else{
				begin=mid+1;
			}
		}
		return end*end==num?true:false;
	}
    //Implement pow(x, n), which calculates x raised to the power n (xn).
	//	Example 1:
	//
	//	Input: 2.00000, 10
	//	Output: 1024.00000
	//	Example 2:
	//
	//	Input: 2.10000, 3
	//	Output: 9.26100
	//	Example 3:
	//
	//	Input: 2.00000, -2
	//	Output: 0.25000
	//	Explanation: 2-2 = 1/22 = 1/4 = 0.25

	public static double myPow(double x, int n) {
		if(n==0){
            return 1;
        }
        if(n<0){
		    return 1/(x*myPow(x,-(n+1)));
        }
		if(n%2==0){
			return myPow(x*x,n/2);
		}else{
			return x*myPow(x*x,(n-1)/2);
		}

	}
//	Find Smallest Letter Greater Than Target
//	Go to Discuss
//	Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
//
//	Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
//	Examples:
//	Input:
//	letters = ["c", "f", "j"]
//	target = "a"
//	Output: "c"
	public static char nextGreatestLetter(char[] letters, char target) {
		int begin=0;
		int end=letters.length-1;
		int tar=(int)target;
		while(end>begin){
			int mid=begin+(end-begin)/2;
			if(mid==0&&(int)(letters[mid])>tar){
				return letters[mid];
			}
			if((int)letters[mid]<=tar&&tar<(int)letters[mid+1]){
				return letters[mid+1];
			}
			if((int)letters[mid]>tar){
				end=mid;
			}else{
				begin=mid+1;
			}
		}
		return letters[0];
	}
	
	public static void main(String[] args) {
		char[] letters={'c', 'f', 'j'};

		System.out.println(nextGreatestLetter(letters,'c'));
	}


	public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
		//数组长度为0的时候要处理
		if (pre.length == 0) {
			return null;
		}

		int rootVal = pre[0];

		//数组长度仅为1的时候就要处理
		if (pre.length == 1) {
			return new TreeNode(rootVal);
		}

		//我们先找到root所在的位置，确定好前序和中序中左子树和右子树序列的范围
		TreeNode root = new TreeNode(rootVal);
		int rootIndex = 0;
		for (int i = 0; i < in.length; i++) {
			if (rootVal == in[i]) {
				rootIndex = i;
				break;
			}
		}

		//递归，假设root的左右子树都已经构建完毕，那么只要将左右子树安到root左右即可
		//这里注意Arrays.copyOfRange(int[],start,end)是[)的区间
		root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, rootIndex + 1), Arrays.copyOfRange(in, 0, rootIndex));
		root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, rootIndex + 1, pre.length), Arrays.copyOfRange(in, rootIndex + 1, in.length));


		return root;
	}
}
