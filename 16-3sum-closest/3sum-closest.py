class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        closest = float("inf")        
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue            
            min_sum = nums[i] + nums[i + 1] + nums[i + 2]
            if min_sum - target > abs(closest - target):
                break
            max_sum = nums[i] + nums[-1] + nums[-2]
            if target - max_sum > abs(closest - target):
                continue
            left, right = i + 1, len(nums) - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if abs(total - target) < abs(closest - target):
                    closest = total
                if total == target:
                    return total
                elif total < target:
                    left += 1
                else:
                    right -= 1
        return closest