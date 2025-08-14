class Solution:
    def largestGoodInteger(self, num: str) -> str:
        res = ""
        nums = ['999','888','777','666','555','444','333','222','111','000']
        for st in nums:
            if st in num:
                return st
        return res
