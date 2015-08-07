package com.zlu.leetcode.stringproblem;

public class AddBinary {
	public String addBinary(String a, String b) {
        if(a.length() == 0 || b.length() ==0){
            return a.length()==0 ? b : a;
        }
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        char[] result = new char[Math.max(a.length(),b.length())];
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int indexR = result.length - 1;
        int carry = 0;
        int numA = 0;
        int numB = 0;
        while(indexA >= 0 || indexB >= 0){
            if(indexA < 0) numA = 0;
            else numA = charA[indexA] - '0';
            if(indexB < 0) numB = 0;
            else numB = charB[indexB] - '0';
            int total = numA + numB + carry;
            result[indexR--] = (char)(total%2 + '0');
            if(total > 1) carry = 1;
            else carry = 0;
            indexA--;
            indexB--;
        }

        if(carry == 1)
            return String.valueOf(1) + new String(result);
        else return  new String(result);

    }
}
