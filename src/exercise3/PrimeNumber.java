package exercise3;

import java.util.Scanner;

public class PrimeNumber{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    int a = 2;
    boolean Prime = true;
    while(a<number){
      if(number%a==0){
        Prime=false;
      }
      a++;
    }
    System.out.println("Prime number: " + Prime);
  }
}