class Solution {
    public int removeDuplicates(int[] nums) {
        int arr[] =new int[201];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]+100]++;
        }
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
            nums[c++]=i-100;
        }}
return c;
    }
}