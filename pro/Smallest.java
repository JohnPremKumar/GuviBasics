/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Smallest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int sub = sc.nextInt();
		long min = Long.MAX_VALUE;
		char[] in = input.toCharArray();
		int seperator = in.length - sub;
		if(sub > 0){
		    for(int i = 0; i <= in.length - seperator; i++){
		        String temp = "";
		        for(int j = i; j < i + seperator; j++){
		            temp = temp + String.valueOf(in[j]);
		        }
		        System.out.println(temp);
		        if(Long.valueOf(temp) < min){
		            min = Long.valueOf(temp);
		        }
		    }
		}
		else{
		    min = Long.valueOf(input);
		}
		System.out.println(min);
	}
}
