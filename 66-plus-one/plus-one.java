class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] + 1 != 10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int []newNumber = new int[digits.length+1];
        newNumber[0] = 1;
        return newNumber;
        
    }
}