package com.zlu.leetcode.mathproblem;

public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int width1 = G - E;
        int heigh1 = H - F;
        int width2 = C - A;
        int heigh2 = D - B;
        int area1 = width1*heigh1;
        int area2 = width2*heigh2;

        int width = Math.max(Math.max(Math.abs(G - A), Math.abs(C - E)),Math.max(Math.abs(G - E), Math.abs(C - A)));
        int heigh =  Math.max(Math.max(Math.abs(D - F), Math.abs(H - B)),Math.max(Math.abs(D - B), Math.abs(H - F)));

        
        if(width1+width2 <= width || heigh1+heigh2 <= heigh)
            return area1 + area2;
        int area_cover = (width1+width2-width) * (heigh1+heigh2-heigh);
        return area1 + area2 - area_cover;
    }
}
