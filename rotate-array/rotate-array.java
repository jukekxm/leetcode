class Solution {
    public void rotate(int[] nums, int k) {
        
        int length = nums.length;
        k = k % length;

        swap(0, length, nums);
        swap(0, k, nums);
        swap(k, length, nums);
    }
    
    private void swap(int startIdx, int endIdx, int[] nums) {
        int targetIdx = endIdx - 1;
        
        for (int i = startIdx; i < (startIdx + endIdx) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[targetIdx];
            nums[targetIdx--] = temp; 
        }
    }
}