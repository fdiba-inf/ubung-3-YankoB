package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    do{
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0){
      double P = (a+b+c)/2.0;
      double Area = Math.sqrt((P*(P-a)*(P-b)*(P-c)));
      System.out.println("Area: " + Area);
      if(a==b && b==c){
        System.out.println("Triangle: equilateral");
      }else if(a==b || b==c || c==a){
        System.out.println("Triangle: isosceles");
      }else {
        System.out.println("Triangle: scalene");
      }
    }else{
      System.out.println("Values are not correct!");
     }
    }while(true);
  }
}