package com.zlu.leetcode.arrayproblem;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++)
            result.add(countNum(rowIndex,Math.min(i, rowIndex - i)));
        return result;
    }

    public int countNum(int n, int m){
        double result = 1.0;
        for(int i = 0; i != m; i++){
            result *= n - i;
            result /= m - i;
        }
        return (int)Math.round(result);

    }
}
