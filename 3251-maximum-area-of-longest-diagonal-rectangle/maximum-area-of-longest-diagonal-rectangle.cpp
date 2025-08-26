class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        auto cmp=[](vector<int>& r1, vector<int>& r2){
            const int w1=r1[0], h1=r1[1], w2=r2[0], h2=r2[1];
            return make_pair(w1*w1+h1*h1, w1*h1)<make_pair(w2*w2+h2*h2, w2*h2);
        };
        auto it=max_element(dimensions.begin(), dimensions.end(), cmp);
        return (*it)[0]*(*it)[1];
    }
};