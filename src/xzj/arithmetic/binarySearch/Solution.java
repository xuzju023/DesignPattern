package xzj.arithmetic.binarySearch;

import java.util.Arrays;

import javax.sound.midi.MidiChannel;

public class Solution  extends GuessGame{
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
	
	

	
	public static void main(String[] args) {
		
		pick=2;
		int i = guessNumber(2);
		System.out.println(i);
	}
	
}
