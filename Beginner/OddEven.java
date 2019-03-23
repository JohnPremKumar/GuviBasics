import java.io.*;
import java.util.Scanner;

class OddEven {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(input <= 0){
      System.out.println("Invlaid");
    }
    else if(input%2 == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }
}
