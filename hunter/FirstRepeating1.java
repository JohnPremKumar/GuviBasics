/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class FirstRepeating {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] in = new int[n];
		for(int i = 0; i < n; i++){
		    in[i] = s.nextInt();
		}
		boolean check = true;
  outer:for(int i = 0; i < n; i++){
		    check = true;
		    for(int j = 0; j < n; j++){
		        if(i != j && in[i] == in[j]){
		            check = false;
		            break;
		        }
		    }
		    if(!check){
		        System.out.print(in[i]);
		        break outer;
		    }
		}
		if(check){
		    System.out.print("unique");
		}
	}
}
//
