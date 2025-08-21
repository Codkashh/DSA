class Solution:
    def numSubmat(self, g: List[List[int]]) -> int:
        m,n,p = len(g),len(g[0]),[[*accumulate(r,lambda q,v:q*v+v)] for r in g]
        return sum(sum(accumulate((p[ii][j] for ii in range(i,m)),min))
            for i,j in product(range(m),range(n)))