/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Maxvalue {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] in = new int[n];
		for(int i = 0; i < n; i++){
		    in[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < n; i++){
		    for(int j = i; j < n; j++){
		        if(in[i] < in[j]){
		            temp = in[i];
		            in[i] = in[j];
		            in[j] = temp;
		        }
		    }
		}
		if(in[0] == 0){
		    System.out.println("0");
		}
		else{
		    for(int i = 0; i < n; i++){
		        System.out.print(in[i]);
		    }
		}
	}
}
