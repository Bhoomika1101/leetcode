class Solution {
    public int maximumProduct(int[] nums) {
    int temp;
    Arrays.sort(nums);
    int n=nums.length;
    temp=Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    return temp;
    }
}