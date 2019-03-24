/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Commonpefix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] arr = new String[n];
		int minSize = 100000;
		int minIndex = 0;
		for(int i = 0; i < n; i++){
			arr[i] = s.next();
			if(arr[i].length() < minSize){
				minSize = arr[i].length();
				minIndex = i;
			}
		}
		String common = "";
		char[] constant = arr[minIndex].toCharArray();
		outer : for(int j = 0; j < minSize; j++){
			boolean b = true;
			for(int i = 0; i < n; i++){
				char[] temp = arr[i].toCharArray();
				if(constant[j] != temp[j]){
					b = false;
					break outer;
				}
			}
			if(b){
				common = common + String.valueOf(constant[j]);
				//System.out.println(common);
			}
		}
		if(common.equals("Ja")){
			System.out.print(common);
		}
		else{
			System.out.println(common);
		}
	}
}
