package com.zlu.leetcode.arrayproblem;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i != numRows; i++){
            List<Integer> line = new ArrayList<>();
            if(i == 0) line.add(1);
            else{
                for(int j = 0; j <= i; j++){
                    if(j == 0 || j == i)
                        line.add(1);
                    else
                        line.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(line);
        }
        
        return result;
    }
}
