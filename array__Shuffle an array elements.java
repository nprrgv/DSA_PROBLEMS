class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i=i+2){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
        }
        return arr;
    }
}
