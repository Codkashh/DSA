class Solution:
    def flowerGame(self, n: int, m: int) -> int:
        oddX = (n + 1) // 2
        evenX = n // 2

        oddY = (m + 1) // 2
        evenY = m // 2
        return oddX * evenY + evenX * oddY