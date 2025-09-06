class Solution:
    def minOperations(self, queries: List[List[int]]) -> int:
        ans = 0
        temp1 = 1
        temp2 = 1   

        for query in queries:
            a = -1
            b = -1

            # Find largest power of 4 <= query[0]
            while temp1 <= query[0]:
                a = temp1
                temp1 *= 4

            # Find smallest power of 4 >= query[1]
            while temp2 < query[1]:
                temp2 *= 4
                b = temp2

            diff = b - a
            dif_with_a = query[0] - a   # offset from lower bound
            dif_with_b = b - query[1]   # offset from upper bound

            # Reset temp1 and temp2 to powers found
            temp1, temp2 = a, b
            cnt_a = 0
            cnt_b = 0

            # Count number of divisions by 4 needed for 'a'
            while temp1 > 0:
                temp1 //= 4
                cnt_a += 1

            # Count number of divisions by 4 needed for 'b'
            while temp2 > 0:
                temp2 //= 4
                cnt_b += 1   

            sub = cnt_b

            # Case 1: bounds are in consecutive levels
            if cnt_a + 1 == cnt_b:
                tempans = (diff * cnt_a) + sub
            else:
                # Case 2: walk downward from b while adjusting cost
                tempans = cnt_b
                while b / 4 >= a:
                    temp_dif = b - (b / 4)
                    tempans += temp_dif * (sub - 1) 
                    sub -= 1
                    b /= 4

            # Adjust for elements outside the range [l, r]
            tempans -= (dif_with_a * cnt_a)
            tempans -= (dif_with_b * (cnt_b - 1))

            # Edge cases if upper side has extra offset
            if dif_with_b != 0:
                tempans -= 1

            # Each operation takes 2 numbers → ceil for odd counts
            ans += ceil(tempans / 2)

            # Reset powers of 4 for next query
            temp1 = 1
            temp2 = 1
            
        return ans