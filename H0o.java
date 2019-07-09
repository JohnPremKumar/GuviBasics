/*package whatever //do not write package name here */
//
import java.io.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class RepeatFinder {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size; i++){
		    arr[i] = s.nextInt();
		}
		List<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < size - 1; i++){
		    boolean check = true;
		    for(int j = i+1; j < size ; j++){
		        if(arr[i] == arr[j]){
		            check = false;
		            break;
		        }
		    }
		    if(!check){
		        values.add(arr[i]);
		    }
		}
		if(values.isEmpty()){
		    System.out.println("unique");
		}
		else{
		    Collections.sort(values);
		    for(int i : values){
		        System.out.print(i + " ");
		    }
		}
	}
}
