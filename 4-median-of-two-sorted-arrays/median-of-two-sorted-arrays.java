class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int [] newArray = new int[n + m];
        int k = 0;

        for(int i = 0; i<n; i++){
            newArray[k++] = nums1[i];
        }
        for(int i = 0; i<m; i++){
            newArray[k++] = nums2[i];
        }

        Arrays.sort(newArray);

        int length = newArray.length;

        if(length % 2 == 1) {
            return (double) newArray[length / 2];
        } else {
            int midOne = newArray[length / 2 - 1];
            int midSecond = newArray[length / 2];
            return ((double) midOne + (double) midSecond)/2;
        }
    }
}