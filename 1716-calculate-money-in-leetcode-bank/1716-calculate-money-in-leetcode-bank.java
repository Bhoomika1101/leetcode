class Solution {
    public int totalMoney(int n) {
         int q=n/7, r=n%7;
         double ans = ((double)q/2)*(2*28+(q-1)*7);
        ans+=((double)r/2)*(2*(q+1)+(r-1)*1);
        return (int)ans;
        
    }
}