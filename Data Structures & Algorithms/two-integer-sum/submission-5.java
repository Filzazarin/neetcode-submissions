class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i =0; i <nums.length; i++){
    //         for(int j = i+1 ; j< nums.length; j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[0];
        
    // }

    //approach2: 
    public static int[] twoSum(int[] nums, int target) {
        // Step 1: Copy original array with indices
        int n = nums.length;
        int[][] arr = new int[n][2]; // [value, originalIndex]
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Step 2: Sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Two pointer approach
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left][0] + arr[right][0]; // value sum krke dekho [right][0] k mtlb
            if (sum == target) {
                return new int[]{Math.min(arr[left][1], arr[right][1]),Math.max(arr[left][1], arr[right][1])}; // return original indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{}; // no solution
    }
}
