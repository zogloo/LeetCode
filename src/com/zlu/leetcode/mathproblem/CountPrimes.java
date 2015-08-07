package com.zlu.leetcode.mathproblem;

public class CountPrimes {
	public int countPrimes(int n) {
        if(n <2)
           return 0;
       int[] primes = new int[n];
       for(int i = 0; i != primes.length; i++)
           primes[i] = i;
       primes[1] = 0;
       int flag = (int)Math.sqrt((double)n);
       int index = 2;
       while(index <= flag){
           int temp = index;
           temp += index;
           while(temp < n){
               primes[temp] = 0;
               temp += index;
           }
           index++;
           while(primes[index] == 0)
               index++;
       }

       int count = 0;
       for (int i = 0; i != primes.length; i++){
           if(primes[i] != 0)
               count++;
       }
       return count;
   }
}
