package com.zlu.leetcode.stringproblem;

public class IntegertoEnglishWords {
	String[] lessTen = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
	String[] lessHundred = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	String[] lessTwenty = {"Ten ","Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ","Nineteen "};
	String[] unit = {"Billion ", "Million ", "Thousand ",""};
	
	public String numberToWords(int num) {
		StringBuilder ret = new StringBuilder();
		int[] value = new int[4];
		for(int i = 3; i >=0; i--){
			value[i] = num % 1000;
			num /= 1000;
		}
		
		for(int i = 0; i < 4; i++){
			if(value[i] == 0)
				continue;
			ret.append(toNumString(value[i])).append(unit[i] );
		}
		
		return ret.length() == 0 ? "Zero" : ret.substring(0,ret.length()-1).toString();
	}
	
	public  StringBuilder toNumString(int num) {
		StringBuilder sb = new StringBuilder(); 
		int digitOfHundred = num /100;
		num %= 100;
		int digitOfDecade = num / 10;
		num %= 10;
		int digitOfSingle = num;
		
		if(digitOfHundred != 0)
			sb.append(lessTen[digitOfHundred]).append("Hundred ");
		
		if(digitOfDecade != 0){
			if(digitOfDecade == 1){
				sb.append(lessTwenty[digitOfSingle]);
				return sb;
			}
			else
				sb.append(lessHundred[digitOfDecade]);
		}
		
		if(digitOfSingle != 0)
			sb.append(lessTen[digitOfSingle]);
		return sb;
	}
}
