import java.util.*;
import java.util.Scanner;
public class numguess {
    public static void main(String[] args) {
      System.out.println("Guess a number fromm 1 to 10");  
      Scanner sc = new Scanner(System.in);
      Random ran= new Random();
      int number= ran.nextInt(10)+1;
      int guess= 0;
      int attempt=0;
       while(number!=guess) {
         guess= sc.nextInt();
         attempt++;
        if(number>guess) {
        System.out.println("You guessed a lower number, guess higher");
      }
       else if(number<guess){
        System.out.println("You guessed a higher number, guess lower");
       }
        else
         {
        System.out.println("you guessed it right in "+attempt+" attempts");
      }
      
     
      }
      sc.close();
      
     }
    }
    


