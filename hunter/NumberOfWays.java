/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = String.valueOf(sc.nextInt()).toCharArray();
		int count = 1;
		for(int i = 0; i < in.length - 1; i++){
		    if(Integer.valueOf("" + in[i]+in[i+1]) <= 26 && Integer.valueOf("" + in[i] + in[i+1]) >= 10){
		        count++;
		    }
		}
		if(in.length >= 4){
		    for(int i = 0; i < in.length - 1;){
		        for(int j = i + 2; j < in.length - 1;){
		            if(Integer.valueOf("" + in[i] + in[i+1]) <= 26 
		            && Integer.valueOf("" + in[j] + in[j+1]) <= 26
		            && Integer.valueOf("" + in[i] + in[i+1]) >= 10
		            && Integer.valueOf("" + in[j] + in[j+1]) >= 10){
		                count++;
		            }
		            j++;
		        }
		        i++;
		    }
		}
		System.out.println(count);
	}
}
