class Solution {
    public String reverseStr(String s, int k) {
         
       char[]arr= s.toCharArray();
    for(int i = 0; i <arr.length ; i+=2*k){
       int l = i;
         int e = Math.min(i+k-1,arr.length-1);
        while(l<e){
            char temp = arr[l];
            arr[l]=arr[e];
            arr[e]= temp;
            l++;
            e--;
        }
    }
    s = new String(arr);
    return s;
    }
}