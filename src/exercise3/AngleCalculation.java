package exercise3;

import java.util.Scanner;

public class AngleCalculation{

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  double a = input.nextDouble();
  char b = input.next().charAt(0);
  while(b=='r'||b=='d'){
    if(b=='r'){
      double Grad = 180*a/Math.PI;
      System.out.println("Angle: " + Grad + "d");
      a= input.nextDouble();
      b= input.next().charAt(0);
    }
    else if(b=='d'){
      double Rad = a*Math.PI/180.0;
      System.out.println("Angel: " + Rad + "r");
      a= input.nextDouble();
      b= input.next().charAt(0);
    }else{
      break;
    }
  }
  }
}