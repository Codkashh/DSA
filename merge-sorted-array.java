class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int iIndex = m-1;
        int nIndex = n-1;
        int mIndex = m+n-1;
        while(nIndex >= 0){
            if(iIndex >= 0 && nums1[iIndex] > nums2[nIndex]){
                nums1[mIndex] = nums1[iIndex];
                iIndex--;
            } else{
                nums1[mIndex] = nums2[nIndex];
                nIndex--;
            }
            mIndex--;
        }
    }
}