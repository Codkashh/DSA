class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int sum = 0;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while(n1 >= 0 || n2 >= 0 || carry > 0) {
            sum = carry;
            if(n1 >= 0){
                sum = sum + num1.charAt(n1) - '0';
                n1--;
            }
            if(n2 >= 0){
                sum = sum + num2.charAt(n2) - '0';
                n2--;
            }
            ans.append(sum % 10);
            carry = sum/10;
        }
        return ans.reverse().toString();
    }
}