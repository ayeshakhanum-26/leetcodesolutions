class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        // traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // ek array suppose kro nums=[1,3,2,4,2,2,3] val=2
            // check kro if nums[i] != val

            if (nums[i] == val) {
                // just skip, i++ already handled by for loop
            } else {
                nums[k] = nums[i]; // valid element ko front mein rakho
                k++;
            }
        }

        return k; // ✅ don't forget this!
    }
}