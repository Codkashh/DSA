class Solution:
    def zeroFilledSubarray(self, nums: list[int]) -> int:
        ans = 0
        currentStreak = 0
        
        for num in nums:
            if num == 0:
                # Increment the streak length
                currentStreak += 1
                # Add the streak contribution
                ans += currentStreak
            else:
                # Reset the streak when non-zero is found
                currentStreak = 0
                
        return ans