class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int m=0;
        while(n>0){
           m= n%10;
           sum = sum+m;
           product = product*m;
           n=n/10; 
        }
        int res =product-sum;
        return res;
    }
     
    }