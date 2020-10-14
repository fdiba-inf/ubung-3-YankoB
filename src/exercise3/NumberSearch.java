package exercise3;

public class NumberSearch {

  public static void main(String[] args){
    int anzahl = 0;
   for(int a = 100; a<=1000; a++){
     if(a%5==0 && a%6==0){
       if(anzahl<9){
         System.out.print(a + " ");
         anzahl++;
       }else if(anzahl==9){
         anzahl++;
         System.out.print(a);
       } if(anzahl==10){
         System.out.print("\n");
         anzahl=0;
       }
   }
  }
 } 
} 