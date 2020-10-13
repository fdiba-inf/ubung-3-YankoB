package exercise3;

import java.util.Scanner;

public class NumberCounter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int positive = 0;
    int negative = 0;
    double sum = 0;
    double average = 0;

    int number = input.nextInt();
    while(number!=0){
      if(number>0){
        positive++;
      }else{
        negative++;
      }
      sum = sum+number;
      average = sum/(positive+negative);
      number=input.nextInt();
    }
    System.out.println("Positive numbers: " + positive);
    System.out.println("Negative numbers: " + negative);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}