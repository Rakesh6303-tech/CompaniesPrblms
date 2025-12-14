<--------------Coding Round------------------->
1)What is Immutability?Give Examples.How can u create Immutable Class?

2)Given a sentence, find the 2nd highest (second longest) word and print the word along with its length using Java Streams?

3)Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Input:
nums = [2, 7, 11, 15]
target = 9
Output:
[0, 1]
Explanation : nums[0] + nums[1] = 2 + 7 = 9
I wrote ---->The brute-force solution uses two loops with O(n²) time complexity.
Interview asked---->The optimized solution uses a HashMap and runs in O(n).”

4)(This problem is called “Search in Rotated Sorted Array.)Given a rotated sorted array of distinct integers and a target value, 
return the index of the target if it exists in the array. Otherwise, return -1.
Note : You must write an algorithm with O(log n) time complexity.
Input:
nums = [4,5,6,7,0,1,2]
target = 0
Output:
4
  

<----------Interview Questions-------->
What are the Java 8 Features?
write a query to print city of  average ordersamount from the table?
TableName : Orders, Columns : order_id, city, order_amount, Date.
Project Releated : Your API code looks good and doesn’t need changes. Currently, the API response time is around 300ms.
If we want to reduce it to 200ms or even 100ms, what changes would you make specifically in the SQL query?

<--------------------------Coding Solutions--------------------------------->
3)int[] nums = {2, 7, 11, 15};
int target = 9;

Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {   // ✅ ONLY ONE LOOP
    int need = target - nums[i];

    if (map.containsKey(need)) {
        System.out.println(map.get(need) + " " + i);
        break;
    }

    map.put(nums[i], i);
}

4)class Solution {
    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // target found
            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}
Dry Run
low=0, high=6
mid=3 → nums[mid]=7

Left side [4,5,6,7] is sorted
target=0 is NOT in left side

→ move to right side

low=4, high=6
mid=5 → nums[mid]=1

Right side [0,1,2] is sorted
target=0 is in range

→ high=4

mid=4 → nums[mid]=0 ✅ FOUND

