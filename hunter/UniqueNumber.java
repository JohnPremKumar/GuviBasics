/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class UniqueNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] in = new int[n];
		for(int i = 0; i < n; i++){
		    in[i] = sc.nextInt();
		}
		int uniq = 0;
  outer:for(int i = 0; i < n; i++){
		    boolean check = true;
		    uniq = in[i];
		    for(int j = 0; j < n; j++){
		        if(i != j && uniq == in[j]){
		            check = false;
		            break;
		        }
		    }
		    if(check){
		        System.out.println(uniq);
		        break outer;
		    }
		}
	}
}
