package com.coder.converter;

public class NumberToWordsConverter {
	
	private static final String[] units = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	private static final String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	public static String convert(int n){
		String number="";	
		
		if(n < 0){
			n = -n;
			number = number + "minus ";
		}
			
		if(n == 0){
			number = "zero";
		}else{
			number = number + handle(n);
		}			
		
		return number;
	}

	private static String handle(int n) {

		if(n < 20){
			return units[n];
		}
		if(n < 100){
			return tens[n/10] + (n%10 == 0 ? " " : " " + units[n%10]); 
		}
		if(n < 1000){
			return units[n/100] + " hundred " + (n%100 == 0 ? "" : "and ") + handle(n%100);
		}
		if(n < 1000000){
			return handle(n/1000) + " thousand " + handle(n%1000);
		}
		if(n < 10000000){
			return units[n/1000000] + " million " + handle(n%1000000);
		}
		if(n < 1000000000){
			return handle(n/1000000) + " million " + handle(n%1000000);
		}
		
		return "Please pick a number below 1000000000";
	
	}

	public static void main(String args[]){
		System.out.println(convert(-7845));
		System.out.println(convert(0));
		System.out.println(convert(1));
		System.out.println(convert(21));
		System.out.println(convert(105));
		System.out.println(convert(56945781));
		System.out.println(convert(1000000001));		
	}

}
