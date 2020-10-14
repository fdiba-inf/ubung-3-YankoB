package exercise3;

import java.util.Scanner;

public class NamePrinter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String name =input.next();
    for(int a=0; a<name.length(); a++){
      char letter = name.charAt(a);
      System.out.println("* " + letter + " *");
    }
  }
}